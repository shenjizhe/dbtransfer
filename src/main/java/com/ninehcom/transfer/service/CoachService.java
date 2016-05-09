package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Coach;
import com.ninehcom.transfer.mapper.CoachMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Coach的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachService {

    @Autowired
    private  CoachMapper  coachMapper;
    public Result selectAllCoach() {
        List<Coach> list = coachMapper.selectAllCoach();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachById(int Id) {
        Coach coach = coachMapper.selectCoachById(Id);
        return Result.Success(coach);
    }
}
