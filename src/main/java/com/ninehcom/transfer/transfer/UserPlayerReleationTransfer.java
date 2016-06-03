/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.UserPlayerRelation;
import com.ninehcom.transfer.entity.UserRePlayer;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import com.ninehcom.transfer.mapper.UserPlayerRelationMapper;
import com.ninehcom.transfer.mapper.UserRePlayerMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class UserPlayerReleationTransfer extends
        TransferBase<UserPlayerRelation, UserRePlayer> implements ITransfer {

    @Autowired
    PlayerMappingMapper playerMappingMapper;
    @Autowired
    UserPlayerRelationMapper userPlayerRelationMapper;
    @Autowired
    UserRePlayerMapper userRePlayerMapper;
    @Autowired
    private TranslogMapper translogMapper;

    @Override
    public UserRePlayer CreateDestination(UserPlayerRelation source, int id) {
        UserRePlayer relation = new UserRePlayer();
        relation.setUserId(source.getUserId());
        relation.setPlayID(source.getPlayID());
        relation.setType(source.getType());
        relation.setTime(source.getTime());
        return relation;
    }

    @Override
    public void AddSameDataMapping(UserPlayerRelation obj1, UserRePlayer obj2) {

    }

    @Override
    public void AddDiffDataMapping(UserPlayerRelation obj1, UserRePlayer obj2) {
        userRePlayerMapper.insertUserRePlayer(obj2);
    }

    @Override
    public int getDestinationMaxId() {
        return 0;
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
        List<UserPlayerRelation> userplayerReList = userPlayerRelationMapper.selectAllUserPlayerRelation();
        List<UserRePlayer> userRePlayerList = userRePlayerMapper.selectAllUserRePlayer();

        return trans(UserPlayerRelation.class, UserRePlayer.class, userplayerReList, userRePlayerList, "user_player_relation", "user_re_player", "getUserId,getPlayID", "getUserId,getPlayID");
    }

}
