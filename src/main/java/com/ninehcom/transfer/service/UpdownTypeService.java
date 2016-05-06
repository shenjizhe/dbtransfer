package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.UpdownType;
import com.ninehcom.transfer.mapper.UpdownTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UpdownType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class UpdownTypeService {

    @Autowired
    private  UpdownTypeMapper  updownTypeMapper;
    public Result selectAllUpdownType() {
        List<UpdownType> list = updownTypeMapper.selectAllUpdownType();
        return Result.Success((ArrayList)list);
    }
    public Result selectUpdownTypeById(int Id) {
        UpdownType updownType = updownTypeMapper.selectUpdownTypeById(Id);
        return Result.Success(updownType);
    }
    public Result insertUpdownType(UpdownType updownType) {
        int count = updownTypeMapper.insertUpdownType(updownType);
        return Result.Success(count);
    }
    public Result updateUpdownType(UpdownType updownType) {
        int count = updownTypeMapper.updateUpdownType(updownType);
        return Result.Success(count);
    }
    public Result deleteUpdownTypeById(int Id) {
        int count = updownTypeMapper.deleteUpdownTypeById(Id);
        return Result.Success(count);
    }
}
