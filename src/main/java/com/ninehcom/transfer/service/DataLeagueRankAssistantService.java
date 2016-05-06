package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankAssistant;
import com.ninehcom.transfer.mapper.DataLeagueRankAssistantMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankAssistant的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankAssistantService {

    @Autowired
    private  DataLeagueRankAssistantMapper  dataLeagueRankAssistantMapper;
    public Result selectAllDataLeagueRankAssistant() {
        List<DataLeagueRankAssistant> list = dataLeagueRankAssistantMapper.selectAllDataLeagueRankAssistant();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankAssistantById(int Id) {
        DataLeagueRankAssistant dataLeagueRankAssistant = dataLeagueRankAssistantMapper.selectDataLeagueRankAssistantById(Id);
        return Result.Success(dataLeagueRankAssistant);
    }
    public Result insertDataLeagueRankAssistant(DataLeagueRankAssistant dataLeagueRankAssistant) {
        int count = dataLeagueRankAssistantMapper.insertDataLeagueRankAssistant(dataLeagueRankAssistant);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankAssistant(DataLeagueRankAssistant dataLeagueRankAssistant) {
        int count = dataLeagueRankAssistantMapper.updateDataLeagueRankAssistant(dataLeagueRankAssistant);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankAssistantById(int Id) {
        int count = dataLeagueRankAssistantMapper.deleteDataLeagueRankAssistantById(Id);
        return Result.Success(count);
    }
}
