package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueOutstanding;
import com.ninehcom.transfer.mapper.DataLeagueOutstandingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueOutstanding的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueOutstandingService {

    @Autowired
    private  DataLeagueOutstandingMapper  dataLeagueOutstandingMapper;
    public Result selectAllDataLeagueOutstanding() {
        List<DataLeagueOutstanding> list = dataLeagueOutstandingMapper.selectAllDataLeagueOutstanding();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueOutstandingById(int Id) {
        DataLeagueOutstanding dataLeagueOutstanding = dataLeagueOutstandingMapper.selectDataLeagueOutstandingById(Id);
        return Result.Success(dataLeagueOutstanding);
    }
    public Result insertDataLeagueOutstanding(DataLeagueOutstanding dataLeagueOutstanding) {
        int count = dataLeagueOutstandingMapper.insertDataLeagueOutstanding(dataLeagueOutstanding);
        return Result.Success(count);
    }
    public Result updateDataLeagueOutstanding(DataLeagueOutstanding dataLeagueOutstanding) {
        int count = dataLeagueOutstandingMapper.updateDataLeagueOutstanding(dataLeagueOutstanding);
        return Result.Success(count);
    }
    public Result deleteDataLeagueOutstandingById(int Id) {
        int count = dataLeagueOutstandingMapper.deleteDataLeagueOutstandingById(Id);
        return Result.Success(count);
    }
}
