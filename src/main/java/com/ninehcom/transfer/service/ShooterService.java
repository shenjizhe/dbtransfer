package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Shooter;
import com.ninehcom.transfer.mapper.ShooterMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Shooter的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ShooterService {

    @Autowired
    private  ShooterMapper  shooterMapper;
    public Result selectAllShooter() {
        List<Shooter> list = shooterMapper.selectAllShooter();
        return Result.Success((ArrayList)list);
    }
    public Result selectShooterById(int Id) {
        Shooter shooter = shooterMapper.selectShooterById(Id);
        return Result.Success(shooter);
    }
}
