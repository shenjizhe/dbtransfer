/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.ClubPlayerReClub;
import com.ninehcom.transfer.entity.DataPlayerReClub;
import com.ninehcom.transfer.entity.PlayerHistoryMapping;
import com.ninehcom.transfer.entity.Playerhistory;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.ClubPlayerReClubMapper;
import com.ninehcom.transfer.mapper.DataPlayerReClubMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.PlayerHistoryMappingMapper;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.PlayerhistoryMapper;
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
public class PlayerHistoryTransfer extends TransferBase<Playerhistory, DataPlayerReClub> implements ITransfer {

    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }
    final int[] POINT_IDS = new int[]{1, 2, 3, 3, 3, 4, 3, 2};
    final String[] POINT_NAMES = new String[]{"门将", "后卫", "中场", "中场", "中场", "前锋", "中场", "后卫"};

    @Autowired
    PlayerhistoryMapper playerhistoryMapper;
    @Autowired
    DataPlayerReClubMapper dataPlayerReClubMapper;
    @Autowired
    ClubPlayerReClubMapper clubPlayerReClubMapper;
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

        ClubMapping clubMapping = clubMap.get(source.getTeamId().intValue());
        long clubId = clubMapping.getClubId();
        player.setClubId(clubId);
        ClubHistoryMapping clubHistoryMapping = clubHistoryMap.get(source.getTeamHistoryId().intValue());
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

    private ClubPlayerReClub createObj(Playerhistory obj1, DataPlayerReClub obj2) {
        ClubPlayerReClub data = new ClubPlayerReClub();
        data.setId(obj2.getId());
        data.setCirAvatar(obj1.getHalfLogo());
        data.setFullAvatar(obj1.getLogo());
        data.setInfoAvatar(obj1.getInfoLogo());
        return data;
    }

    @Override
    public void AddSameDataMapping(Playerhistory obj1, DataPlayerReClub obj2) {
        PlayerHistoryMapping mapping = new PlayerHistoryMapping(obj1.getId(), obj2.getId());
        playerHistoryMappingMapper.insertPlayerHistoryMapping(mapping);

        ClubPlayerReClub data = createObj(obj1, obj2);
        clubPlayerReClubMapper.insertClubPlayerReClub(data);
    }

    @Override
    public void AddDiffDataMapping(Playerhistory obj1, DataPlayerReClub obj2) {
        dataPlayerReClubMapper.insertDataPlayerReClub(obj2);
        PlayerHistoryMapping mapping = new PlayerHistoryMapping(obj1.getId(), obj2.getId());
        playerHistoryMappingMapper.insertPlayerHistoryMapping(mapping);

        ClubPlayerReClub data = createObj(obj1, obj2);
        clubPlayerReClubMapper.insertClubPlayerReClub(data);
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

    Map<Integer, ClubMapping> clubMap = null;
    Map<Integer, ClubHistoryMapping> clubHistoryMap = null;

    @Override
    public Result trans() {
        clubMap = clubMappingMapper.selectMapClubMapping();
        clubHistoryMap = clubHistoryMappingMapper.selectMapClubHistoryMapping();

        List<Playerhistory> playerList = playerhistoryMapper.selectAllPlayerhistory();
        List<DataPlayerReClub> dataPlayerList = dataPlayerReClubMapper.selectAllDataPlayerReClub();

        return trans(Playerhistory.class, DataPlayerReClub.class, playerList, dataPlayerList, "playerHistory", "data_player_re_club", "getPlayerId,getYears,getEnterTimes", "getPlayerId,getYear,getOnfield");
    }

    @Override
    public String getT1Key(Playerhistory obj1) {
        return obj1.getId().toString();
    }

    @Override
    public String getT2Key(DataPlayerReClub obj2) {
        return obj2.getId().toString();
    }
}
