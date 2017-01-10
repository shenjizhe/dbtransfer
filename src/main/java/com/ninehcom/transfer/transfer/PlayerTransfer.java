/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.DataPlayer;
import com.ninehcom.transfer.entity.Player;
import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.DataPlayerMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.PlayerMapper;
import com.ninehcom.transfer.mapper.PlayerMappingMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class PlayerTransfer extends TransferBase<Player, DataPlayer> implements ITransfer {

    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }
    @Autowired
    PlayerMapper playerMapper;
    @Autowired
    DataPlayerMapper dataPlayerMapper;
    @Autowired
    PlayerMappingMapper playerMappingMapper;
    @Autowired
    TranslogMapper translogMapper;

    @Override
    public DataPlayer CreateDestination(Player source, int id) {
        DataPlayer player = new DataPlayer();
        player.setId((long) id);
        player.setBirth(source.getBirthday());
        player.setCountry(source.getNationality());
        player.setName(source.getName());
        player.setCreatedAt(source.getCreateTime());
        player.setUpdatedAt(source.getUpdateTime());
        return player;
    }

    @Override
    public void AddSameDataMapping(Player obj1, DataPlayer obj2) {
        PlayerMapping mapping = new PlayerMapping(obj1.getId(), obj2.getId());
        playerMappingMapper.insertPlayerMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(Player obj1, DataPlayer obj2) {
        dataPlayerMapper.insertDataPlayer(obj2);
        PlayerMapping mapping = new PlayerMapping(obj1.getId(), obj2.getId());
        playerMappingMapper.insertPlayerMapping(mapping);
    }

    @Override
    public int getDestinationMaxId() {
        return dataPlayerMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return null;
    }

    @Override
    public Result trans() {
        List<Player> playerList = playerMapper.selectAllPlayer();
        List<DataPlayer> dataPlayerList = dataPlayerMapper.selectAllDataPlayer();
        return trans(Player.class, DataPlayer.class, playerList, dataPlayerList, "player", "data_player", "getName,getBirthday", "getName,getBirth");
    }
}
