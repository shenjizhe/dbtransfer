package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.PlayerLineType;
import com.ninehcom.transfer.mapper.PlayerLineTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlayerLineType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class PlayerLineTypeService {

    @Autowired
    private  PlayerLineTypeMapper  playerLineTypeMapper;
    public Result selectAllPlayerLineType() {
        List<PlayerLineType> list = playerLineTypeMapper.selectAllPlayerLineType();
        return Result.Success((ArrayList)list);
    }
    public Result selectPlayerLineTypeById(int Id) {
        PlayerLineType playerLineType = playerLineTypeMapper.selectPlayerLineTypeById(Id);
        return Result.Success(playerLineType);
    }
    public Result insertPlayerLineType(PlayerLineType playerLineType) {
        int count = playerLineTypeMapper.insertPlayerLineType(playerLineType);
        return Result.Success(count);
    }
    public Result updatePlayerLineType(PlayerLineType playerLineType) {
        int count = playerLineTypeMapper.updatePlayerLineType(playerLineType);
        return Result.Success(count);
    }
    public Result deletePlayerLineTypeById(int Id) {
        int count = playerLineTypeMapper.deletePlayerLineTypeById(Id);
        return Result.Success(count);
    }
}
