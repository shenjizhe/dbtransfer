/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataMatchStat;
import com.ninehcom.transfer.entity.Leaguedata;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataMatchStatMapper;
import com.ninehcom.transfer.mapper.LeaguedataMapper;
import com.ninehcom.transfer.mapper.MatchMappingMapper;
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
public class MatchDataTransfer extends TransferBase<Leaguedata, DataMatchStat> implements ITransfer {

    @Autowired
    LeaguedataMapper leaguedataMapper;
    @Autowired
    DataMatchStatMapper dataMatchStatMapper;
    @Autowired
    MatchMappingMapper matchMappingMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    TranslogMapper translogMapper;

    @Override
    public DataMatchStat CreateDestination(Leaguedata source, int id) {
        DataMatchStat data = new DataMatchStat();
        data.setId((long) id);
        data.setMatchId(source.getLeagueCalendarId().longValue());

        long clubId = clubMap.get(source.getTeamId()).getClubId();
        data.setClubId(clubId);
        data.setClubType(source.getLeagueTeamTypeId());
        data.setYear(source.getYears());

        data.setToShoot(source.getShootTimes());
        data.setInTarget(source.getShootInTimes());
        data.setMissGoals(source.getShootOutTimes());
        data.setHitWoodwork(source.getHitTimes());
        data.setSpotKick(source.getPenaltyTimes());
        data.setPassTimes(source.getPassTimes());
        data.setThroughPass(source.getStraightTimes());
        data.setOffside(source.getOffsideTimes());
        data.setSteal(source.getStealTimes());
        data.setFreeKick(source.getFreeKickTimes());
        data.setCorner(source.getCornerTimes());
        data.setOutOfBounds(source.getThrowInTimes());
        data.setPassCompl(source.getPassRate());
        data.setPassMiddle(source.getPassCenterRate());
        data.setStealRate(source.getStealRate());
        data.setPossession(source.getControllRate());
        data.setFouls(source.getFoulTimes());
        data.setYellowCards(source.getYellowTimes());
        data.setRedCards(source.getRedTimes());
        data.setInjury(source.getHurtTimes());

        data.setCreatedAt(source.getCreateTime());
        data.setUpdatedAt(source.getUpdateTime());
        return data;
    }

    @Override
    public void AddSameDataMapping(Leaguedata obj1, DataMatchStat obj2) {

    }

    @Override
    public void AddDiffDataMapping(Leaguedata obj1, DataMatchStat obj2) {
        dataMatchStatMapper.insertDataMatchStat(obj2);
    }

    @Override
    public int getDestinationMaxId() {
        return dataMatchStatMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return matchMappingMapper;
    }

    Map<Integer, ClubMapping> clubMap = null;

    @Override
    public Result trans() {
        clubMap = clubMappingMapper.selectMapClubMapping();
        List<Leaguedata> club_data = leaguedataMapper.selectAllLeaguedata();
        List<DataMatchStat> data_data = dataMatchStatMapper.selectAllDataMatchStat();

        return trans(Leaguedata.class, DataMatchStat.class, club_data, data_data, "leaguedata", "data_match_stat", "getLeagueCalendarId,getLeagueTeamTypeId", "getMatchId,getClubType");
    }

}
