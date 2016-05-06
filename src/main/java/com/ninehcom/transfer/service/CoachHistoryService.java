package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.CoachHistory;
import com.ninehcom.transfer.mapper.CoachHistoryMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CoachHistory的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachHistoryService {

    @Autowired
    private  CoachHistoryMapper  coachHistoryMapper;
    public Result selectAllCoachHistory() {
        List<CoachHistory> list = coachHistoryMapper.selectAllCoachHistory();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachHistoryById(int Id) {
        CoachHistory coachHistory = coachHistoryMapper.selectCoachHistoryById(Id);
        return Result.Success(coachHistory);
    }
    public Result insertCoachHistory(CoachHistory coachHistory) {
        int count = coachHistoryMapper.insertCoachHistory(coachHistory);
        return Result.Success(count);
    }
    public Result updateCoachHistory(CoachHistory coachHistory) {
        int count = coachHistoryMapper.updateCoachHistory(coachHistory);
        return Result.Success(count);
    }
    public Result deleteCoachHistoryById(int Id) {
        int count = coachHistoryMapper.deleteCoachHistoryById(Id);
        return Result.Success(count);
    }
}
