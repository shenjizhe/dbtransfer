/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataPlayerReClub;
import com.ninehcom.transfer.entity.PlayerHistoryMapping;
import com.ninehcom.transfer.entity.Playerhistory;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataPlayerReClubMapper;
import com.ninehcom.transfer.mapper.PlayerHistoryMappingMapper;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.PlayerhistoryMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class PlayerHistoryTransfer extends TransferBase<Playerhistory, DataPlayerReClub> implements ITransfer {

    final int[] POINT_IDS = new int[]{1, 2, 3, 3, 3, 4, 3, 2};
    final String[] POINT_NAMES = new String[]{"门将", "后卫", "中场", "中场", "中场", "前锋", "中场", "后卫"};

    @Autowired
    PlayerhistoryMapper playerhistoryMapper;
    @Autowired
    DataPlayerReClubMapper dataPlayerReClubMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    ClubHistoryMappingMapper clubHistoryMappingMapper;
    @Autowired
    PlayerMappingMapper playerMappingMapper;
    @Autowired
    PlayerHistoryMappingMapper playerHistoryMappingMapper;
    @Autowired
    private TranslogMapper translogMapper;

    private void changePosition(Playerhistory source, DataPlayerReClub destination) {
        // bitmap
        int index = source.getPositionId() - 1;
        destination.setPositionNumber(POINT_IDS[index]);
        destination.setPosition(POINT_NAMES[index]);
    }

    @Override
    public DataPlayerReClub CreateDestination(Playerhistory source, int id) {
        DataPlayerReClub player = new DataPlayerReClub();
        player.setId((long) id);

        ClubMapping clubMapping = clubMappingMapper.selectClubMappingById(source.getTeamId().intValue());
        long clubId = clubMapping.getClubId();
        player.setClubId(clubId);
        ClubHistoryMapping clubHistoryMapping = clubHistoryMappingMapper.selectClubHistoryMappingById(source.getTeamHistoryId().intValue());
        long clubHistoryId = clubHistoryMapping.getClubHistoryId();
        player.setClubHistoryId(clubHistoryId);
        changePosition(source, player);

        player.setPlayerId(source.getPlayerId().longValue());
        player.setAvatar(source.getLogo());
        player.setYear(source.getYears());
        player.setHeight(source.getHeight());
        player.setWeight(source.getWeight());

        player.setOnfield(source.getEnterTimes());
        player.setOnfieldLast(source.getEnterTime());
        player.setGoals(source.getShootTimes());
        player.setAssistTimes(source.getAssistTimes());
        player.setRedTimes(source.getRedTimes());
        player.setYellowTimes(source.getYellowTimes());
        player.setPlayerNumber(source.getJerseyNum());

        player.setCreatedAt(source.getCreateTime());
        player.setUpdatedAt(source.getUpdateTime());

        player.setIsLastServed(true);
        player.setLeagueType(1);
        return player;
    }

    @Override
    public void AddSameDataMapping(Playerhistory obj1, DataPlayerReClub obj2) {
        PlayerHistoryMapping mapping = new PlayerHistoryMapping(obj1.getId(), obj2.getId());
        playerHistoryMappingMapper.insertPlayerHistoryMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(Playerhistory obj1, DataPlayerReClub obj2) {
        dataPlayerReClubMapper.insertDataPlayerReClub(obj2);
        PlayerHistoryMapping mapping = new PlayerHistoryMapping(obj1.getId(), obj2.getId());
        playerHistoryMappingMapper.insertPlayerHistoryMapping(mapping);
    }

    @Override
    public int getDestinationMaxId() {
        return dataPlayerReClubMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return playerMappingMapper;
    }

    @Override
    public Result trans() {
        List<Playerhistory> playerList = playerhistoryMapper.selectAllPlayerhistory();
        List<DataPlayerReClub> dataPlayerList = dataPlayerReClubMapper.selectAllDataPlayerReClub();

        return trans(Playerhistory.class, DataPlayerReClub.class, playerList, dataPlayerList, "playerHistory", "data_player_re_club", "getPlayerId,getYears", "getPlayerId,getYear");
    }

}
