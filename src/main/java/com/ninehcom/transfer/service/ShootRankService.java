package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ShootRank;
import com.ninehcom.transfer.mapper.ShootRankMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ShootRank的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ShootRankService {

    @Autowired
    private  ShootRankMapper  shootRankMapper;
    public Result selectAllShootRank() {
        List<ShootRank> list = shootRankMapper.selectAllShootRank();
        return Result.Success((ArrayList)list);
    }
    public Result selectShootRankById(int Id) {
        ShootRank shootRank = shootRankMapper.selectShootRankById(Id);
        return Result.Success(shootRank);
    }
    public Result insertShootRank(ShootRank shootRank) {
        int count = shootRankMapper.insertShootRank(shootRank);
        return Result.Success(count);
    }
    public Result updateShootRank(ShootRank shootRank) {
        int count = shootRankMapper.updateShootRank(shootRank);
        return Result.Success(count);
    }
    public Result deleteShootRankById(int Id) {
        int count = shootRankMapper.deleteShootRankById(Id);
        return Result.Success(count);
    }
}
