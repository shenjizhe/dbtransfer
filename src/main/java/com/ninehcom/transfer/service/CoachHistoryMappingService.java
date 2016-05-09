package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.CoachHistoryMapping;
import com.ninehcom.transfer.mapper.CoachHistoryMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CoachHistoryMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachHistoryMappingService {

    @Autowired
    private  CoachHistoryMappingMapper  coachHistoryMappingMapper;
    public Result selectAllCoachHistoryMapping() {
        List<CoachHistoryMapping> list = coachHistoryMappingMapper.selectAllCoachHistoryMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachHistoryMappingById(int Id) {
        CoachHistoryMapping coachHistoryMapping = coachHistoryMappingMapper.selectCoachHistoryMappingById(Id);
        return Result.Success(coachHistoryMapping);
    }
    public Result insertCoachHistoryMapping(CoachHistoryMapping coachHistoryMapping) {
        int count = coachHistoryMappingMapper.insertCoachHistoryMapping(coachHistoryMapping);
        return Result.Success(count);
    }
    public Result updateCoachHistoryMapping(CoachHistoryMapping coachHistoryMapping) {
        int count = coachHistoryMappingMapper.updateCoachHistoryMapping(coachHistoryMapping);
        return Result.Success(count);
    }
    public Result deleteCoachHistoryMappingById(int Id) {
        int count = coachHistoryMappingMapper.deleteCoachHistoryMappingById(Id);
        return Result.Success(count);
    }
}
