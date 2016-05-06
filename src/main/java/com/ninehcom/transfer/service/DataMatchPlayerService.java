package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataMatchPlayer;
import com.ninehcom.transfer.mapper.DataMatchPlayerMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataMatchPlayer的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataMatchPlayerService {

    @Autowired
    private  DataMatchPlayerMapper  dataMatchPlayerMapper;
    public Result selectAllDataMatchPlayer() {
        List<DataMatchPlayer> list = dataMatchPlayerMapper.selectAllDataMatchPlayer();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataMatchPlayerById(int Id) {
        DataMatchPlayer dataMatchPlayer = dataMatchPlayerMapper.selectDataMatchPlayerById(Id);
        return Result.Success(dataMatchPlayer);
    }
    public Result insertDataMatchPlayer(DataMatchPlayer dataMatchPlayer) {
        int count = dataMatchPlayerMapper.insertDataMatchPlayer(dataMatchPlayer);
        return Result.Success(count);
    }
    public Result updateDataMatchPlayer(DataMatchPlayer dataMatchPlayer) {
        int count = dataMatchPlayerMapper.updateDataMatchPlayer(dataMatchPlayer);
        return Result.Success(count);
    }
    public Result deleteDataMatchPlayerById(int Id) {
        int count = dataMatchPlayerMapper.deleteDataMatchPlayerById(Id);
        return Result.Success(count);
    }
}
