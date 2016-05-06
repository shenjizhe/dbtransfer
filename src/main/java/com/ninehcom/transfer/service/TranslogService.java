package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Translog;
import com.ninehcom.transfer.mapper.TranslogMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Translog的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class TranslogService {

    @Autowired
    private  TranslogMapper  translogMapper;
    public Result selectAllTranslog() {
        List<Translog> list = translogMapper.selectAllTranslog();
        return Result.Success((ArrayList)list);
    }
    public Result selectTranslogById(int Id) {
        Translog translog = translogMapper.selectTranslogById(Id);
        return Result.Success(translog);
    }
    public Result insertTranslog(Translog translog) {
        int count = translogMapper.insertTranslog(translog);
        return Result.Success(count);
    }
    public Result updateTranslog(Translog translog) {
        int count = translogMapper.updateTranslog(translog);
        return Result.Success(count);
    }
    public Result deleteTranslogById(int Id) {
        int count = translogMapper.deleteTranslogById(Id);
        return Result.Success(count);
    }
}
