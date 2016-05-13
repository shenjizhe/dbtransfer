/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.Assist;
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataLeagueRankAssistant;
import com.ninehcom.transfer.entity.PlayerMapping;

import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataLeagueRankAssistantMapper;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.AssistMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class AssistRankTransfer extends TransferBase<Assist, DataLeagueRankAssistant> implements ITransfer {

    @Autowired
    AssistMapper assistMapper;
    @Autowired
    DataLeagueRankAssistantMapper dataLeagueRankAssistantMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    ClubHistoryMappingMapper clubHistoryMappingMapper;
    @Autowired
    PlayerMappingMapper playerMappingMapper;
    @Autowired
    private TranslogMapper translogMapper;

    @Override
    public DataLeagueRankAssistant CreateDestination(Assist source, int id) {
        DataLeagueRankAssistant assistant = new DataLeagueRankAssistant();
        assistant.setId((long) id);

        int index = source.getLeagueTypeId() - 1;
        assistant.setLeagueId(LeagueMatchTransfer.LEAGUE_TYPE_IDS[index]);
        long clubId = teamMap.get(source.getTeamId()).getClubId();
        assistant.setClubId(clubId);
        long clubHistoryId = teamHistoryMap.get(source.getTeamHistoryId()).getClubHistoryId();
        assistant.setClubHistoryId(clubHistoryId);
        long playerId = playerMap.get(source.getPlayerId()).getDataPlayerId();
        assistant.setPlayerId(playerId);

        assistant.setPreRanking(source.getPreRank());
        assistant.setRanking(source.getRank());
        assistant.setYear(source.getYears());
        assistant.setAssistants(source.getTimes());
        assistant.setCreatedAt(source.getCreateTime());
        assistant.setUpdatedAt(source.getUpdateTime());

        return assistant;
    }

    @Override
    public void AddSameDataMapping(Assist obj1, DataLeagueRankAssistant obj2) {

    }

    @Override
    public void AddDiffDataMapping(Assist obj1, DataLeagueRankAssistant obj2) {
        dataLeagueRankAssistantMapper.insertDataLeagueRankAssistant(obj2);
    }

    @Override
    public int getDestinationMaxId() {
        return dataLeagueRankAssistantMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return null;
    }

    Map<Integer, ClubMapping> teamMap = null;
    Map<Integer, ClubHistoryMapping> teamHistoryMap = null;
    Map<Integer, PlayerMapping> playerMap = null;

    @Override
    public Result trans() {
        teamMap = clubMappingMapper.selectMapClubMapping();
        teamHistoryMap = clubHistoryMappingMapper.selectMapClubHistoryMapping();
        playerMap = playerMappingMapper.selectMapPlayerMapping();

        List<Assist> assistList = assistMapper.selectFilterAssist();
        List<DataLeagueRankAssistant> rankAssistList = dataLeagueRankAssistantMapper.selectAllDataLeagueRankAssistant();

        return trans(Assist.class, DataLeagueRankAssistant.class, assistList, rankAssistList, "assist", "data_league_rank_assistant", null, null);
    }

}
