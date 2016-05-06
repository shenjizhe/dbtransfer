package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataCoach;
import com.ninehcom.transfer.mapper.DataCoachMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataCoach的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataCoachService {

    @Autowired
    private  DataCoachMapper  dataCoachMapper;
    public Result selectAllDataCoach() {
        List<DataCoach> list = dataCoachMapper.selectAllDataCoach();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataCoachById(int Id) {
        DataCoach dataCoach = dataCoachMapper.selectDataCoachById(Id);
        return Result.Success(dataCoach);
    }
    public Result insertDataCoach(DataCoach dataCoach) {
        int count = dataCoachMapper.insertDataCoach(dataCoach);
        return Result.Success(count);
    }
    public Result updateDataCoach(DataCoach dataCoach) {
        int count = dataCoachMapper.updateDataCoach(dataCoach);
        return Result.Success(count);
    }
    public Result deleteDataCoachById(int Id) {
        int count = dataCoachMapper.deleteDataCoachById(Id);
        return Result.Success(count);
    }
}
