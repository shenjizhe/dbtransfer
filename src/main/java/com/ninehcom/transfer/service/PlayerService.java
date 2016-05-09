package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Player;
import com.ninehcom.transfer.mapper.PlayerMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Player的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class PlayerService {

    @Autowired
    private  PlayerMapper  playerMapper;
    public Result selectAllPlayer() {
        List<Player> list = playerMapper.selectAllPlayer();
        return Result.Success((ArrayList)list);
    }
    public Result selectPlayerById(int Id) {
        Player player = playerMapper.selectPlayerById(Id);
        return Result.Success(player);
    }
}
