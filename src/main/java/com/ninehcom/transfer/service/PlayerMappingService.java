package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlayerMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class PlayerMappingService {

    @Autowired
    private  PlayerMappingMapper  playerMappingMapper;
    public Result selectAllPlayerMapping() {
        List<PlayerMapping> list = playerMappingMapper.selectAllPlayerMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectPlayerMappingById(int Id) {
        PlayerMapping playerMapping = playerMappingMapper.selectPlayerMappingById(Id);
        return Result.Success(playerMapping);
    }
    public Result insertPlayerMapping(PlayerMapping playerMapping) {
        int count = playerMappingMapper.insertPlayerMapping(playerMapping);
        return Result.Success(count);
    }
    public Result updatePlayerMapping(PlayerMapping playerMapping) {
        int count = playerMappingMapper.updatePlayerMapping(playerMapping);
        return Result.Success(count);
    }
    public Result deletePlayerMappingById(int Id) {
        int count = playerMappingMapper.deletePlayerMappingById(Id);
        return Result.Success(count);
    }
}
