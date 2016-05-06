/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.enums.ErrorCode;
import com.ninehcom.common.util.ListComparator;
import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubHistory;
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.entity.Teamhistory;
import com.ninehcom.transfer.entity.Translog;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMapper;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.TeamhistoryMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class ClubHistoryTransfer implements ITransfer{

    @Autowired
    private ClubHistoryMapper clubHistoryMapper;
    @Autowired
    private TeamhistoryMapper teamhistoryMapper;
    @Autowired
    private TranslogMapper translogMapper;
    @Autowired
    private ClubMappingMapper clubMappingMapper;
    @Autowired
    private ClubHistoryMappingMapper clubHistoryMappingMapper;

    @Override
    public Result trans() {
        List<Teamhistory> teamList = teamhistoryMapper.selectAllTeamhistory();
        List<ClubHistory> clubList = clubHistoryMapper.selectAllClubHistory();
        
        clubMappingMapper.reset(teamList);
        Translog log = new Translog();
        
        try {
            ListComparator<Teamhistory, ClubHistory> comparator = new ListComparator(Teamhistory.class, ClubHistory.class, "getTeamId,getYears", "getClubId,getYear");
            ListComparator.Result result = comparator.compare(teamList, clubList);
            
            log = result.getLog(teamList, clubList, "teamhistory", "club_history");
            Map<Teamhistory, ClubHistory> same = result.getSame();
            int mappingCount = 0;
            for (Teamhistory team : same.keySet()) {
                ClubHistory club = same.get(team);
                ClubHistoryMapping mapping = new ClubHistoryMapping(team.getId(), club.getId());
                clubHistoryMappingMapper.insertClubHistoryMapping(mapping);
                mappingCount++;
            }
            
            int id = clubHistoryMapper.getMax();
            List<Teamhistory> diff1 = result.getDiff1();
            for (Teamhistory team : diff1) {
                ClubHistory club = new ClubHistory();
                id++;
                club.setId((long) id);
                club.setClubId(team.getTeamId().longValue());
                club.setName(team.getName());
                club.setEnName(team.getEnglishName());
                club.setCourt(team.getHomeCourt());
                club.setLogo(team.getLogo());
                club.setYear(team.getYears().toString());
                club.setCreatedAt(team.getCreateTime());
                club.setUpdatedAt(team.getUpdateTime());

                clubHistoryMapper.insertClubHistory(club);
                ClubHistoryMapping mapping = new ClubHistoryMapping(team.getId(), club.getId());
                clubHistoryMappingMapper.insertClubHistoryMapping(mapping);
                mappingCount++;
            }
            log.setMappingCount(mappingCount);
        }  catch (Exception ex) {
            log.setErr(ex.getMessage() + "\t" + ex.getStackTrace());
            Logger.getLogger(ClubHistoryTransfer.class.getName()).log(Level.SEVERE, null, ex);
            translogMapper.insertTranslog(log);
            return Result.Fail(ErrorCode.Fail, ex);
        }
            
        translogMapper.insertTranslog(log);
        return Result.Success();
    }
}
