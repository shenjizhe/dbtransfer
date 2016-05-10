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
import com.ninehcom.transfer.entity.Playerhistory;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataPlayerReClubMapper;
import com.ninehcom.transfer.mapper.PlayerhistoryMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class PlayerHistoryTransfer extends TransferBase<Playerhistory, DataPlayerReClub> implements ITransfer {

    int[] POINT_IDS=new int[]{1,2,3,3,3,4,3,2};
    String[] POINT_NAMES=new String[]{"门将","后卫","中场","中场","中场","前锋","中场","后卫"};
    
    @Autowired
    PlayerhistoryMapper playerhistoryMapper;
    @Autowired
    DataPlayerReClubMapper dataPlayerReClubMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    ClubHistoryMappingMapper clubHistoryMappingMapper;

    private void changePosition(Playerhistory source,DataPlayerReClub destination){
        // bitmap
        int index = source.getPositionId()-1;
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
        player.setClubId(clubHistoryId);
        changePosition(source,player);

        player.setAvatar(source.getLogo());
        player.setYear(source.getYears());
        player.setHeight(source.getHeight());
        player.setWeight(source.getWeight());
        
        //TODO:

        player.setCreatedAt(source.getCreateTime());
        player.setUpdatedAt(source.getUpdateTime());
        
        player.setIsLastServed(true);
        player.setLeagueType(1);
        return player;
    }

    @Override
    public void AddSameDataMapping(Playerhistory obj1, DataPlayerReClub obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddDiffDataMapping(Playerhistory obj1, DataPlayerReClub obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDestinationMaxId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TranslogMapper getTranslogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IMapper getReseter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Result trans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
