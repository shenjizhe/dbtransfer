package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataJudge;
import com.ninehcom.transfer.mapper.DataJudgeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataJudge的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataJudgeService {

    @Autowired
    private  DataJudgeMapper  dataJudgeMapper;
    public Result selectAllDataJudge() {
        List<DataJudge> list = dataJudgeMapper.selectAllDataJudge();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataJudgeById(int Id) {
        DataJudge dataJudge = dataJudgeMapper.selectDataJudgeById(Id);
        return Result.Success(dataJudge);
    }
    public Result insertDataJudge(DataJudge dataJudge) {
        int count = dataJudgeMapper.insertDataJudge(dataJudge);
        return Result.Success(count);
    }
    public Result updateDataJudge(DataJudge dataJudge) {
        int count = dataJudgeMapper.updateDataJudge(dataJudge);
        return Result.Success(count);
    }
    public Result deleteDataJudgeById(int Id) {
        int count = dataJudgeMapper.deleteDataJudgeById(Id);
        return Result.Success(count);
    }
}
