package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.StateType;
import com.ninehcom.transfer.mapper.StateTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StateType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class StateTypeService {

    @Autowired
    private  StateTypeMapper  stateTypeMapper;
    public Result selectAllStateType() {
        List<StateType> list = stateTypeMapper.selectAllStateType();
        return Result.Success((ArrayList)list);
    }
    public Result selectStateTypeById(int Id) {
        StateType stateType = stateTypeMapper.selectStateTypeById(Id);
        return Result.Success(stateType);
    }
    public Result insertStateType(StateType stateType) {
        int count = stateTypeMapper.insertStateType(stateType);
        return Result.Success(count);
    }
    public Result updateStateType(StateType stateType) {
        int count = stateTypeMapper.updateStateType(stateType);
        return Result.Success(count);
    }
    public Result deleteStateTypeById(int Id) {
        int count = stateTypeMapper.deleteStateTypeById(Id);
        return Result.Success(count);
    }
}
