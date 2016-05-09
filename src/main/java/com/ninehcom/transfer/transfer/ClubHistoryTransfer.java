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
import com.ninehcom.transfer.interfaces.IMapper;
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
public class ClubHistoryTransfer extends TransferBase<Teamhistory, ClubHistory> implements ITransfer {

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

        return trans(Teamhistory.class, ClubHistory.class, teamList, clubList, "teamHistory", "club_history", "getTeamId,getYears", "getClubId,getYear");
    }

    @Override
    public ClubHistory CreateDestination(Teamhistory team, int id) {
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
        return club;
    }

    @Override
    public void AddSameDataMapping(Teamhistory obj1, ClubHistory obj2) {
        ClubHistoryMapping mapping = new ClubHistoryMapping(obj1.getId(), obj2.getId());
        clubHistoryMappingMapper.insertClubHistoryMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(Teamhistory obj1, ClubHistory obj2) {
        clubHistoryMapper.insertClubHistory(obj2);
        ClubHistoryMapping mapping = new ClubHistoryMapping(obj1.getId(), obj2.getId());
        clubHistoryMappingMapper.insertClubHistoryMapping(mapping);
    }

    @Override
    public int getDestinationMaxId() {
        return clubHistoryMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return clubMappingMapper;
    }
}
