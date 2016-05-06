package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.AssistRank;
import com.ninehcom.transfer.mapper.AssistRankMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AssistRank的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class AssistRankService {

    @Autowired
    private  AssistRankMapper  assistRankMapper;
    public Result selectAllAssistRank() {
        List<AssistRank> list = assistRankMapper.selectAllAssistRank();
        return Result.Success((ArrayList)list);
    }
    public Result selectAssistRankById(int Id) {
        AssistRank assistRank = assistRankMapper.selectAssistRankById(Id);
        return Result.Success(assistRank);
    }
    public Result insertAssistRank(AssistRank assistRank) {
        int count = assistRankMapper.insertAssistRank(assistRank);
        return Result.Success(count);
    }
    public Result updateAssistRank(AssistRank assistRank) {
        int count = assistRankMapper.updateAssistRank(assistRank);
        return Result.Success(count);
    }
    public Result deleteAssistRankById(int Id) {
        int count = assistRankMapper.deleteAssistRankById(Id);
        return Result.Success(count);
    }
}
