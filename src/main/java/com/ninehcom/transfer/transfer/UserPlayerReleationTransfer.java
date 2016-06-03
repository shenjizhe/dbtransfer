/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.transfer.entity.Translog;
import com.ninehcom.transfer.entity.UserPlayerRelation;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import com.ninehcom.transfer.mapper.UserPlayerRelationMapper;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Shenjizhe
 */
public class UserPlayerReleationTransfer implements ITransfer {

    @Autowired
    PlayerMappingMapper playerMappingMapper;
    @Autowired
    UserPlayerRelationMapper userPlayerRelationMapper;
    @Autowired
    private TranslogMapper translogMapper;

    @Override
    public Result trans() {

        List<UserPlayerRelation> list = userPlayerRelationMapper.selectAllUserPlayerRelation();
        int sourceCount = 0;
        int sameSource = 0;

        for (UserPlayerRelation relation : list) {
            Integer oldPlayerId = relation.getPlayID();
            PlayerMapping player = playerMappingMapper.selectPlayerMappingById(oldPlayerId);
            if (player != null) {
                sourceCount++;
                Long newPlayerId = player.getDataPlayerId();
                relation.setPlayID(newPlayerId.intValue());
                int result = userPlayerRelationMapper.updateUserPlayerRelation(relation);
                if (result == 1) {
                    sameSource++;
                }
            }
        }
        Translog log = createLogger("user_player_relation", "user_player_relation", sourceCount, sameSource);
        translogMapper.insertTranslog(log);

        return Result.Success();
    }

    private Translog createLogger(String source, String destination, int sourceSize, int sameCount) {
        Translog log = new Translog();
        log.setOperator(source + ">>" + destination);
        log.setSource(source);
        log.setDestination(destination);
        log.setSourceCount(sourceSize);
        log.setDestinationCount(sameCount);
        log.setSameCount(sameCount);
        log.setSourceDiff(0);
        log.setDestinationDiff(0);
        log.setTime(new Date());
        return log;
    }
}
