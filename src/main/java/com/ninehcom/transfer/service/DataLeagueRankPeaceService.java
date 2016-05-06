package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankPeace;
import com.ninehcom.transfer.mapper.DataLeagueRankPeaceMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankPeace的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankPeaceService {

    @Autowired
    private  DataLeagueRankPeaceMapper  dataLeagueRankPeaceMapper;
    public Result selectAllDataLeagueRankPeace() {
        List<DataLeagueRankPeace> list = dataLeagueRankPeaceMapper.selectAllDataLeagueRankPeace();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankPeaceById(int Id) {
        DataLeagueRankPeace dataLeagueRankPeace = dataLeagueRankPeaceMapper.selectDataLeagueRankPeaceById(Id);
        return Result.Success(dataLeagueRankPeace);
    }
    public Result insertDataLeagueRankPeace(DataLeagueRankPeace dataLeagueRankPeace) {
        int count = dataLeagueRankPeaceMapper.insertDataLeagueRankPeace(dataLeagueRankPeace);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankPeace(DataLeagueRankPeace dataLeagueRankPeace) {
        int count = dataLeagueRankPeaceMapper.updateDataLeagueRankPeace(dataLeagueRankPeace);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankPeaceById(int Id) {
        int count = dataLeagueRankPeaceMapper.deleteDataLeagueRankPeaceById(Id);
        return Result.Success(count);
    }
}
