package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Errlog;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Errlog的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ErrlogService {

    @Autowired
    private  ErrlogMapper  errlogMapper;
    public Result selectAllErrlog() {
        List<Errlog> list = errlogMapper.selectAllErrlog();
        return Result.Success((ArrayList)list);
    }
    public Result selectErrlogById(int Id) {
        Errlog errlog = errlogMapper.selectErrlogById(Id);
        return Result.Success(errlog);
    }
    public Result insertErrlog(Errlog errlog) {
        int count = errlogMapper.insertErrlog(errlog);
        return Result.Success(count);
    }
    public Result updateErrlog(Errlog errlog) {
        int count = errlogMapper.updateErrlog(errlog);
        return Result.Success(count);
    }
    public Result deleteErrlogById(int Id) {
        int count = errlogMapper.deleteErrlogById(Id);
        return Result.Success(count);
    }
}
