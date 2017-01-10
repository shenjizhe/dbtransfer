/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataLeagueRankGoal;
import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.transfer.entity.Shooter;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataLeagueRankGoalMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.ShooterMapper;
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
public class ShooterRankTransfer extends TransferBase<Shooter, DataLeagueRankGoal> implements ITransfer {

    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }
    @Autowired
    ShooterMapper shooterMapper;
    @Autowired
    DataLeagueRankGoalMapper dataLeagueRankGoalMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    ClubHistoryMappingMapper clubHistoryMappingMapper;
    @Autowired
    PlayerMappingMapper playerMappingMapper;
    @Autowired
    private TranslogMapper translogMapper;

    @Override
    public DataLeagueRankGoal CreateDestination(Shooter source, int id) {
        DataLeagueRankGoal goal = new DataLeagueRankGoal();
        goal.setId((long) id);

        int index = source.getLeagueTypeId() - 1;
        goal.setLeagueId(LeagueMatchTransfer.LEAGUE_TYPE_IDS[index]);
        long clubId = teamMap.get(source.getTeamId()).getClubId();
        goal.setClubId(clubId);
        long clubHistoryId = teamHistoryMap.get(source.getTeamHistoryId()).getClubHistoryId();
        goal.setClubHistoryId(clubHistoryId);
        long playerId = playerMap.get(source.getPlayerId()).getDataPlayerId();
        goal.setPlayerId(playerId);

        goal.setPreRanking(source.getPreRank());
        goal.setRanking(source.getRank());
        goal.setYear(source.getYears());
        goal.setGoals(source.getTimes());
        goal.setCreatedAt(source.getCreateTime());
        goal.setUpdatedAt(source.getUpdateTime());

        return goal;
    }

    @Override
    public void AddSameDataMapping(Shooter obj1, DataLeagueRankGoal obj2) {

    }

    @Override
    public void AddDiffDataMapping(Shooter obj1, DataLeagueRankGoal obj2) {
        dataLeagueRankGoalMapper.insertDataLeagueRankGoal(obj2);
    }

    @Override
    public int getDestinationMaxId() {
        return dataLeagueRankGoalMapper.getMax();
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

        List<Shooter> shooterList = shooterMapper.selectFilterShooter();
        List<DataLeagueRankGoal> rankGoalList = dataLeagueRankGoalMapper.selectAllDataLeagueRankGoal();

        return trans(Shooter.class, DataLeagueRankGoal.class, shooterList, rankGoalList, "shooter", "data_league_rank_goal", null, null);
    }

}
