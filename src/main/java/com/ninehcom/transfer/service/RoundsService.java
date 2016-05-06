package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Rounds;
import com.ninehcom.transfer.mapper.RoundsMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Rounds的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class RoundsService {

    @Autowired
    private  RoundsMapper  roundsMapper;
    public Result selectAllRounds() {
        List<Rounds> list = roundsMapper.selectAllRounds();
        return Result.Success((ArrayList)list);
    }
    public Result selectRoundsById(int Id) {
        Rounds rounds = roundsMapper.selectRoundsById(Id);
        return Result.Success(rounds);
    }
    public Result insertRounds(Rounds rounds) {
        int count = roundsMapper.insertRounds(rounds);
        return Result.Success(count);
    }
    public Result updateRounds(Rounds rounds) {
        int count = roundsMapper.updateRounds(rounds);
        return Result.Success(count);
    }
    public Result deleteRoundsById(int Id) {
        int count = roundsMapper.deleteRoundsById(Id);
        return Result.Success(count);
    }
}
