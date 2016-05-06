package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataPlayer;
import com.ninehcom.transfer.mapper.DataPlayerMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataPlayer的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataPlayerService {

    @Autowired
    private  DataPlayerMapper  dataPlayerMapper;
    public Result selectAllDataPlayer() {
        List<DataPlayer> list = dataPlayerMapper.selectAllDataPlayer();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataPlayerById(int Id) {
        DataPlayer dataPlayer = dataPlayerMapper.selectDataPlayerById(Id);
        return Result.Success(dataPlayer);
    }
    public Result insertDataPlayer(DataPlayer dataPlayer) {
        int count = dataPlayerMapper.insertDataPlayer(dataPlayer);
        return Result.Success(count);
    }
    public Result updateDataPlayer(DataPlayer dataPlayer) {
        int count = dataPlayerMapper.updateDataPlayer(dataPlayer);
        return Result.Success(count);
    }
    public Result deleteDataPlayerById(int Id) {
        int count = dataPlayerMapper.deleteDataPlayerById(Id);
        return Result.Success(count);
    }
}
