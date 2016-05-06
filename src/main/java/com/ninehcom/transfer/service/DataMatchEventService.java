package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataMatchEvent;
import com.ninehcom.transfer.mapper.DataMatchEventMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataMatchEvent的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataMatchEventService {

    @Autowired
    private  DataMatchEventMapper  dataMatchEventMapper;
    public Result selectAllDataMatchEvent() {
        List<DataMatchEvent> list = dataMatchEventMapper.selectAllDataMatchEvent();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataMatchEventById(int Id) {
        DataMatchEvent dataMatchEvent = dataMatchEventMapper.selectDataMatchEventById(Id);
        return Result.Success(dataMatchEvent);
    }
    public Result insertDataMatchEvent(DataMatchEvent dataMatchEvent) {
        int count = dataMatchEventMapper.insertDataMatchEvent(dataMatchEvent);
        return Result.Success(count);
    }
    public Result updateDataMatchEvent(DataMatchEvent dataMatchEvent) {
        int count = dataMatchEventMapper.updateDataMatchEvent(dataMatchEvent);
        return Result.Success(count);
    }
    public Result deleteDataMatchEventById(int Id) {
        int count = dataMatchEventMapper.deleteDataMatchEventById(Id);
        return Result.Success(count);
    }
}
