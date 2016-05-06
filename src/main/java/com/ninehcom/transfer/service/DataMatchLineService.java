package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataMatchLine;
import com.ninehcom.transfer.mapper.DataMatchLineMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataMatchLine的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataMatchLineService {

    @Autowired
    private  DataMatchLineMapper  dataMatchLineMapper;
    public Result selectAllDataMatchLine() {
        List<DataMatchLine> list = dataMatchLineMapper.selectAllDataMatchLine();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataMatchLineById(int Id) {
        DataMatchLine dataMatchLine = dataMatchLineMapper.selectDataMatchLineById(Id);
        return Result.Success(dataMatchLine);
    }
    public Result insertDataMatchLine(DataMatchLine dataMatchLine) {
        int count = dataMatchLineMapper.insertDataMatchLine(dataMatchLine);
        return Result.Success(count);
    }
    public Result updateDataMatchLine(DataMatchLine dataMatchLine) {
        int count = dataMatchLineMapper.updateDataMatchLine(dataMatchLine);
        return Result.Success(count);
    }
    public Result deleteDataMatchLineById(int Id) {
        int count = dataMatchLineMapper.deleteDataMatchLineById(Id);
        return Result.Success(count);
    }
}
