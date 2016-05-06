package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.PlayerPositionType;
import com.ninehcom.transfer.mapper.PlayerPositionTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlayerPositionType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class PlayerPositionTypeService {

    @Autowired
    private  PlayerPositionTypeMapper  playerPositionTypeMapper;
    public Result selectAllPlayerPositionType() {
        List<PlayerPositionType> list = playerPositionTypeMapper.selectAllPlayerPositionType();
        return Result.Success((ArrayList)list);
    }
    public Result selectPlayerPositionTypeById(int Id) {
        PlayerPositionType playerPositionType = playerPositionTypeMapper.selectPlayerPositionTypeById(Id);
        return Result.Success(playerPositionType);
    }
    public Result insertPlayerPositionType(PlayerPositionType playerPositionType) {
        int count = playerPositionTypeMapper.insertPlayerPositionType(playerPositionType);
        return Result.Success(count);
    }
    public Result updatePlayerPositionType(PlayerPositionType playerPositionType) {
        int count = playerPositionTypeMapper.updatePlayerPositionType(playerPositionType);
        return Result.Success(count);
    }
    public Result deletePlayerPositionTypeById(int Id) {
        int count = playerPositionTypeMapper.deletePlayerPositionTypeById(Id);
        return Result.Success(count);
    }
}
