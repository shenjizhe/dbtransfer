package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.JudgeType;
import com.ninehcom.transfer.mapper.JudgeTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * JudgeType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class JudgeTypeService {

    @Autowired
    private  JudgeTypeMapper  judgeTypeMapper;
    public Result selectAllJudgeType() {
        List<JudgeType> list = judgeTypeMapper.selectAllJudgeType();
        return Result.Success((ArrayList)list);
    }
    public Result selectJudgeTypeById(int Id) {
        JudgeType judgeType = judgeTypeMapper.selectJudgeTypeById(Id);
        return Result.Success(judgeType);
    }
    public Result insertJudgeType(JudgeType judgeType) {
        int count = judgeTypeMapper.insertJudgeType(judgeType);
        return Result.Success(count);
    }
    public Result updateJudgeType(JudgeType judgeType) {
        int count = judgeTypeMapper.updateJudgeType(judgeType);
        return Result.Success(count);
    }
    public Result deleteJudgeTypeById(int Id) {
        int count = judgeTypeMapper.deleteJudgeTypeById(Id);
        return Result.Success(count);
    }
}
