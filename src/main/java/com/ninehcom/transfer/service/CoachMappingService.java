package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.CoachMapping;
import com.ninehcom.transfer.mapper.CoachMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CoachMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachMappingService {

    @Autowired
    private  CoachMappingMapper  coachMappingMapper;
    public Result selectAllCoachMapping() {
        List<CoachMapping> list = coachMappingMapper.selectAllCoachMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachMappingById(int Id) {
        CoachMapping coachMapping = coachMappingMapper.selectCoachMappingById(Id);
        return Result.Success(coachMapping);
    }
    public Result insertCoachMapping(CoachMapping coachMapping) {
        int count = coachMappingMapper.insertCoachMapping(coachMapping);
        return Result.Success(count);
    }
    public Result updateCoachMapping(CoachMapping coachMapping) {
        int count = coachMappingMapper.updateCoachMapping(coachMapping);
        return Result.Success(count);
    }
    public Result deleteCoachMappingById(int Id) {
        int count = coachMappingMapper.deleteCoachMappingById(Id);
        return Result.Success(count);
    }
}
