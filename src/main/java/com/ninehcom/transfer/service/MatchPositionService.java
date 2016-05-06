package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.MatchPosition;
import com.ninehcom.transfer.mapper.MatchPositionMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MatchPosition的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class MatchPositionService {

    @Autowired
    private  MatchPositionMapper  matchPositionMapper;
    public Result selectAllMatchPosition() {
        List<MatchPosition> list = matchPositionMapper.selectAllMatchPosition();
        return Result.Success((ArrayList)list);
    }
    public Result selectMatchPositionById(int Id) {
        MatchPosition matchPosition = matchPositionMapper.selectMatchPositionById(Id);
        return Result.Success(matchPosition);
    }
    public Result insertMatchPosition(MatchPosition matchPosition) {
        int count = matchPositionMapper.insertMatchPosition(matchPosition);
        return Result.Success(count);
    }
    public Result updateMatchPosition(MatchPosition matchPosition) {
        int count = matchPositionMapper.updateMatchPosition(matchPosition);
        return Result.Success(count);
    }
    public Result deleteMatchPositionById(int Id) {
        int count = matchPositionMapper.deleteMatchPositionById(Id);
        return Result.Success(count);
    }
}
