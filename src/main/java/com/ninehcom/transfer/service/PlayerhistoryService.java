package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Playerhistory;
import com.ninehcom.transfer.mapper.PlayerhistoryMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Playerhistory的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class PlayerhistoryService {

    @Autowired
    private  PlayerhistoryMapper  playerhistoryMapper;
    public Result selectAllPlayerhistory() {
        List<Playerhistory> list = playerhistoryMapper.selectAllPlayerhistory();
        return Result.Success((ArrayList)list);
    }
    public Result selectPlayerhistoryById(int Id) {
        Playerhistory playerhistory = playerhistoryMapper.selectPlayerhistoryById(Id);
        return Result.Success(playerhistory);
    }
}
