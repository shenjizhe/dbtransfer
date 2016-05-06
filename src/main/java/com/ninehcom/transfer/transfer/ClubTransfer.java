/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.enums.ErrorCode;
import com.ninehcom.common.util.ListComparator;
import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataClub;
import com.ninehcom.transfer.entity.Team;
import com.ninehcom.transfer.entity.Translog;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMapper;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataClubMapper;
import com.ninehcom.transfer.mapper.TeamMapper;
import com.ninehcom.transfer.mapper.TeamhistoryMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
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
public class ClubTransfer implements ITransfer {

    @Autowired
    private ClubHistoryMapper clubHistoryMapper;
    @Autowired
    private DataClubMapper dataClubMapper;
    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private TeamhistoryMapper teamhistoryMapper;
    @Autowired
    private ClubMappingMapper clubMappingMapper;
    @Autowired
    private ClubHistoryMappingMapper clubHistoryMappingMapper;
    @Autowired
    private TranslogMapper translogMapper;

    @Override
    public Result trans() {
        ArrayList errList = new ArrayList();
        List<Team> teamList = teamMapper.selectAllTeam();
        List<DataClub> clubList = dataClubMapper.selectAllDataClub();

        Translog log = new Translog();
        log.setOperator("team>>data_club");
        log.setSource("team");
        log.setDestination("data_club");
        log.setSourceCount(teamList.size());
        log.setDestinationCount(clubList.size());
        try {
            // get same name from listClubHistoryMapper
            ListComparator<Team, DataClub> comparator = new ListComparator(Team.class, DataClub.class, "getName", "getName");
            ListComparator.Result result = comparator.compare(teamList, clubList);

            Map<Team, DataClub> same = result.getSame();

            log.setSameCount(same.size());
            log.setSourceDiff(result.getDiff1().size());
            log.setDestinationDiff(result.getDiff2().size());

            int mappingCount = 0;
            for (Team team : same.keySet()) {
                DataClub club = same.get(team);
                ClubMapping mapping = new ClubMapping(team.getId(), club.getId());
                clubMappingMapper.insertClubMapping(mapping);
                mappingCount++;
            }

            int id = dataClubMapper.selectMaxId();
            List<Team> diff1 = result.getDiff1();
            for (Team team : diff1) {
                DataClub club = new DataClub();
                id++;
                club.setId((long) id);
                club.setCreatedAt(team.getCreateTime());
                club.setUpdatedAt(team.getUpdateTime());
                club.setName(team.getName());

                dataClubMapper.insertDataClub(club);
                ClubMapping mapping = new ClubMapping(team.getId(), club.getId());
                clubMappingMapper.insertClubMapping(mapping);
                mappingCount++;
            }
            log.setMappingCount(mappingCount);
        } catch (Exception ex) {
            log.setErr(ex.getMessage() + "\t" + ex.getStackTrace());
            Logger.getLogger(ClubTransfer.class.getName()).log(Level.SEVERE, null, ex);
            return Result.Fail(ErrorCode.Fail, ex);
        }
        
        int count = log.getDestinationCount() + log.getSourceCount()-log.getSameCount();
        int diffCount = log.getSourceDiff()+log.getDestinationDiff();
        boolean success = count==diffCount;
        log.setCheck(success);
        log.setTime(new Date());
        translogMapper.insertTranslog(log);
        return Result.Success(errList);
    }

    private void selectAllTeam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
