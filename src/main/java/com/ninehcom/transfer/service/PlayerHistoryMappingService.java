package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.PlayerHistoryMapping;
import com.ninehcom.transfer.mapper.PlayerHistoryMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlayerHistoryMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class PlayerHistoryMappingService {

    @Autowired
    private  PlayerHistoryMappingMapper  playerHistoryMappingMapper;
    public Result selectAllPlayerHistoryMapping() {
        List<PlayerHistoryMapping> list = playerHistoryMappingMapper.selectAllPlayerHistoryMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectPlayerHistoryMappingById(int Id) {
        PlayerHistoryMapping playerHistoryMapping = playerHistoryMappingMapper.selectPlayerHistoryMappingById(Id);
        return Result.Success(playerHistoryMapping);
    }
    public Result insertPlayerHistoryMapping(PlayerHistoryMapping playerHistoryMapping) {
        int count = playerHistoryMappingMapper.insertPlayerHistoryMapping(playerHistoryMapping);
        return Result.Success(count);
    }
    public Result updatePlayerHistoryMapping(PlayerHistoryMapping playerHistoryMapping) {
        int count = playerHistoryMappingMapper.updatePlayerHistoryMapping(playerHistoryMapping);
        return Result.Success(count);
    }
    public Result deletePlayerHistoryMappingById(int Id) {
        int count = playerHistoryMappingMapper.deletePlayerHistoryMappingById(Id);
        return Result.Success(count);
    }
}
