package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.CoachType;
import com.ninehcom.transfer.mapper.CoachTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CoachType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachTypeService {

    @Autowired
    private  CoachTypeMapper  coachTypeMapper;
    public Result selectAllCoachType() {
        List<CoachType> list = coachTypeMapper.selectAllCoachType();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachTypeById(int Id) {
        CoachType coachType = coachTypeMapper.selectCoachTypeById(Id);
        return Result.Success(coachType);
    }
    public Result insertCoachType(CoachType coachType) {
        int count = coachTypeMapper.insertCoachType(coachType);
        return Result.Success(count);
    }
    public Result updateCoachType(CoachType coachType) {
        int count = coachTypeMapper.updateCoachType(coachType);
        return Result.Success(count);
    }
    public Result deleteCoachTypeById(int Id) {
        int count = coachTypeMapper.deleteCoachTypeById(Id);
        return Result.Success(count);
    }
}
