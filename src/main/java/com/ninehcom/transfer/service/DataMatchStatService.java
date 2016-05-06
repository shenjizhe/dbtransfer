package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataMatchStat;
import com.ninehcom.transfer.mapper.DataMatchStatMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataMatchStat的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataMatchStatService {

    @Autowired
    private  DataMatchStatMapper  dataMatchStatMapper;
    public Result selectAllDataMatchStat() {
        List<DataMatchStat> list = dataMatchStatMapper.selectAllDataMatchStat();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataMatchStatById(int Id) {
        DataMatchStat dataMatchStat = dataMatchStatMapper.selectDataMatchStatById(Id);
        return Result.Success(dataMatchStat);
    }
    public Result insertDataMatchStat(DataMatchStat dataMatchStat) {
        int count = dataMatchStatMapper.insertDataMatchStat(dataMatchStat);
        return Result.Success(count);
    }
    public Result updateDataMatchStat(DataMatchStat dataMatchStat) {
        int count = dataMatchStatMapper.updateDataMatchStat(dataMatchStat);
        return Result.Success(count);
    }
    public Result deleteDataMatchStatById(int Id) {
        int count = dataMatchStatMapper.deleteDataMatchStatById(Id);
        return Result.Success(count);
    }
}
