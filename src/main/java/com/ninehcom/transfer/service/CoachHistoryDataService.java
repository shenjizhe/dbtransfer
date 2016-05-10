package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.CoachHistoryData;
import com.ninehcom.transfer.mapper.CoachHistoryDataMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CoachHistoryData的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachHistoryDataService {

    @Autowired
    private  CoachHistoryDataMapper  coachHistoryDataMapper;
    public Result selectAllCoachHistoryData() {
        List<CoachHistoryData> list = coachHistoryDataMapper.selectAllCoachHistoryData();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachHistoryDataById(int Id) {
        CoachHistoryData coachHistoryData = coachHistoryDataMapper.selectCoachHistoryDataById(Id);
        return Result.Success(coachHistoryData);
    }
}
