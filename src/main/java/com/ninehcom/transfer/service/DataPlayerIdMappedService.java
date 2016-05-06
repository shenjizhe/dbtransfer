package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataPlayerIdMapped;
import com.ninehcom.transfer.mapper.DataPlayerIdMappedMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataPlayerIdMapped的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataPlayerIdMappedService {

    @Autowired
    private  DataPlayerIdMappedMapper  dataPlayerIdMappedMapper;
    public Result selectAllDataPlayerIdMapped() {
        List<DataPlayerIdMapped> list = dataPlayerIdMappedMapper.selectAllDataPlayerIdMapped();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataPlayerIdMappedById(int Id) {
        DataPlayerIdMapped dataPlayerIdMapped = dataPlayerIdMappedMapper.selectDataPlayerIdMappedById(Id);
        return Result.Success(dataPlayerIdMapped);
    }
    public Result insertDataPlayerIdMapped(DataPlayerIdMapped dataPlayerIdMapped) {
        int count = dataPlayerIdMappedMapper.insertDataPlayerIdMapped(dataPlayerIdMapped);
        return Result.Success(count);
    }
    public Result updateDataPlayerIdMapped(DataPlayerIdMapped dataPlayerIdMapped) {
        int count = dataPlayerIdMappedMapper.updateDataPlayerIdMapped(dataPlayerIdMapped);
        return Result.Success(count);
    }
    public Result deleteDataPlayerIdMappedById(int Id) {
        int count = dataPlayerIdMappedMapper.deleteDataPlayerIdMappedById(Id);
        return Result.Success(count);
    }
}
