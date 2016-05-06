package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueMatchBroadcast;
import com.ninehcom.transfer.mapper.DataLeagueMatchBroadcastMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueMatchBroadcast的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueMatchBroadcastService {

    @Autowired
    private  DataLeagueMatchBroadcastMapper  dataLeagueMatchBroadcastMapper;
    public Result selectAllDataLeagueMatchBroadcast() {
        List<DataLeagueMatchBroadcast> list = dataLeagueMatchBroadcastMapper.selectAllDataLeagueMatchBroadcast();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueMatchBroadcastById(int Id) {
        DataLeagueMatchBroadcast dataLeagueMatchBroadcast = dataLeagueMatchBroadcastMapper.selectDataLeagueMatchBroadcastById(Id);
        return Result.Success(dataLeagueMatchBroadcast);
    }
    public Result insertDataLeagueMatchBroadcast(DataLeagueMatchBroadcast dataLeagueMatchBroadcast) {
        int count = dataLeagueMatchBroadcastMapper.insertDataLeagueMatchBroadcast(dataLeagueMatchBroadcast);
        return Result.Success(count);
    }
    public Result updateDataLeagueMatchBroadcast(DataLeagueMatchBroadcast dataLeagueMatchBroadcast) {
        int count = dataLeagueMatchBroadcastMapper.updateDataLeagueMatchBroadcast(dataLeagueMatchBroadcast);
        return Result.Success(count);
    }
    public Result deleteDataLeagueMatchBroadcastById(int Id) {
        int count = dataLeagueMatchBroadcastMapper.deleteDataLeagueMatchBroadcastById(Id);
        return Result.Success(count);
    }
}
