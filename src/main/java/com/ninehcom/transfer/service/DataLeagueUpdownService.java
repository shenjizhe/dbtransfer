package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueUpdown;
import com.ninehcom.transfer.mapper.DataLeagueUpdownMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueUpdown的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueUpdownService {

    @Autowired
    private  DataLeagueUpdownMapper  dataLeagueUpdownMapper;
    public Result selectAllDataLeagueUpdown() {
        List<DataLeagueUpdown> list = dataLeagueUpdownMapper.selectAllDataLeagueUpdown();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueUpdownById(int Id) {
        DataLeagueUpdown dataLeagueUpdown = dataLeagueUpdownMapper.selectDataLeagueUpdownById(Id);
        return Result.Success(dataLeagueUpdown);
    }
    public Result insertDataLeagueUpdown(DataLeagueUpdown dataLeagueUpdown) {
        int count = dataLeagueUpdownMapper.insertDataLeagueUpdown(dataLeagueUpdown);
        return Result.Success(count);
    }
    public Result updateDataLeagueUpdown(DataLeagueUpdown dataLeagueUpdown) {
        int count = dataLeagueUpdownMapper.updateDataLeagueUpdown(dataLeagueUpdown);
        return Result.Success(count);
    }
    public Result deleteDataLeagueUpdownById(int Id) {
        int count = dataLeagueUpdownMapper.deleteDataLeagueUpdownById(Id);
        return Result.Success(count);
    }
}
