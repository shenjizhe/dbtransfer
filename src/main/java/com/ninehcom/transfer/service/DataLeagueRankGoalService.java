package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankGoal;
import com.ninehcom.transfer.mapper.DataLeagueRankGoalMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankGoal的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankGoalService {

    @Autowired
    private  DataLeagueRankGoalMapper  dataLeagueRankGoalMapper;
    public Result selectAllDataLeagueRankGoal() {
        List<DataLeagueRankGoal> list = dataLeagueRankGoalMapper.selectAllDataLeagueRankGoal();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankGoalById(int Id) {
        DataLeagueRankGoal dataLeagueRankGoal = dataLeagueRankGoalMapper.selectDataLeagueRankGoalById(Id);
        return Result.Success(dataLeagueRankGoal);
    }
    public Result insertDataLeagueRankGoal(DataLeagueRankGoal dataLeagueRankGoal) {
        int count = dataLeagueRankGoalMapper.insertDataLeagueRankGoal(dataLeagueRankGoal);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankGoal(DataLeagueRankGoal dataLeagueRankGoal) {
        int count = dataLeagueRankGoalMapper.updateDataLeagueRankGoal(dataLeagueRankGoal);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankGoalById(int Id) {
        int count = dataLeagueRankGoalMapper.deleteDataLeagueRankGoalById(Id);
        return Result.Success(count);
    }
}
