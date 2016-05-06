package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataJudgeReMatch;
import com.ninehcom.transfer.mapper.DataJudgeReMatchMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataJudgeReMatch的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataJudgeReMatchService {

    @Autowired
    private  DataJudgeReMatchMapper  dataJudgeReMatchMapper;
    public Result selectAllDataJudgeReMatch() {
        List<DataJudgeReMatch> list = dataJudgeReMatchMapper.selectAllDataJudgeReMatch();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataJudgeReMatchById(int Id) {
        DataJudgeReMatch dataJudgeReMatch = dataJudgeReMatchMapper.selectDataJudgeReMatchById(Id);
        return Result.Success(dataJudgeReMatch);
    }
    public Result insertDataJudgeReMatch(DataJudgeReMatch dataJudgeReMatch) {
        int count = dataJudgeReMatchMapper.insertDataJudgeReMatch(dataJudgeReMatch);
        return Result.Success(count);
    }
    public Result updateDataJudgeReMatch(DataJudgeReMatch dataJudgeReMatch) {
        int count = dataJudgeReMatchMapper.updateDataJudgeReMatch(dataJudgeReMatch);
        return Result.Success(count);
    }
    public Result deleteDataJudgeReMatchById(int Id) {
        int count = dataJudgeReMatchMapper.deleteDataJudgeReMatchById(Id);
        return Result.Success(count);
    }
}
