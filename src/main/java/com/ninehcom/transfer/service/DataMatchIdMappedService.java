package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataMatchIdMapped;
import com.ninehcom.transfer.mapper.DataMatchIdMappedMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataMatchIdMapped的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataMatchIdMappedService {

    @Autowired
    private  DataMatchIdMappedMapper  dataMatchIdMappedMapper;
    public Result selectAllDataMatchIdMapped() {
        List<DataMatchIdMapped> list = dataMatchIdMappedMapper.selectAllDataMatchIdMapped();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataMatchIdMappedById(int Id) {
        DataMatchIdMapped dataMatchIdMapped = dataMatchIdMappedMapper.selectDataMatchIdMappedById(Id);
        return Result.Success(dataMatchIdMapped);
    }
    public Result insertDataMatchIdMapped(DataMatchIdMapped dataMatchIdMapped) {
        int count = dataMatchIdMappedMapper.insertDataMatchIdMapped(dataMatchIdMapped);
        return Result.Success(count);
    }
    public Result updateDataMatchIdMapped(DataMatchIdMapped dataMatchIdMapped) {
        int count = dataMatchIdMappedMapper.updateDataMatchIdMapped(dataMatchIdMapped);
        return Result.Success(count);
    }
    public Result deleteDataMatchIdMappedById(int Id) {
        int count = dataMatchIdMappedMapper.deleteDataMatchIdMappedById(Id);
        return Result.Success(count);
    }
}
