package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueMatch;
import com.ninehcom.transfer.mapper.DataLeagueMatchMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueMatch的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueMatchService {

    @Autowired
    private  DataLeagueMatchMapper  dataLeagueMatchMapper;
    public Result selectAllDataLeagueMatch() {
        List<DataLeagueMatch> list = dataLeagueMatchMapper.selectAllDataLeagueMatch();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueMatchById(int Id) {
        DataLeagueMatch dataLeagueMatch = dataLeagueMatchMapper.selectDataLeagueMatchById(Id);
        return Result.Success(dataLeagueMatch);
    }
    public Result insertDataLeagueMatch(DataLeagueMatch dataLeagueMatch) {
        int count = dataLeagueMatchMapper.insertDataLeagueMatch(dataLeagueMatch);
        return Result.Success(count);
    }
    public Result updateDataLeagueMatch(DataLeagueMatch dataLeagueMatch) {
        int count = dataLeagueMatchMapper.updateDataLeagueMatch(dataLeagueMatch);
        return Result.Success(count);
    }
    public Result deleteDataLeagueMatchById(int Id) {
        int count = dataLeagueMatchMapper.deleteDataLeagueMatchById(Id);
        return Result.Success(count);
    }
}
