package com.bfec.transfer.service;

import com.bfec.transfer.mapper.CommonMapper;
import com.bfec.common.enums.ErrorCode;
import com.bfec.common.util.Result;
import java.util.ArrayList;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Playerhistory的Service
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CommonService {

    @Autowired
    private CommonMapper commonMapper;
    @Autowired
    @Qualifier("sqlMap")
    SqlMap sqlMap;

    public Result select(String dsName, Map request) {
        SqlSession session = sqlMap.getSession(dsName);
        if (session == null) {
            return Result.Fail(ErrorCode.DataSourceNotFound);
        }
        ArrayList array = (ArrayList) commonMapper.select(session, request);
        return Result.Success(array);
    }

    public Result add(String dsName, String resource, Map request) {
        SqlSession session = sqlMap.getSession(dsName);
        if (session == null) {
            return Result.Fail(ErrorCode.DataSourceNotFound);
        }
        int ret = commonMapper.insert(session, resource, request);
        if (ret == 1) {
            return Result.Success();
        } else {
            return Result.Fail(ErrorCode.Fail);
        }
    }

    public Result change(String dsName, String resource, Map request, String condition) {
        SqlSession session = sqlMap.getSession(dsName);
        if (session == null) {
            return Result.Fail(ErrorCode.DataSourceNotFound);
        }
        int ret = commonMapper.update(session, resource, request, condition);
        return Result.Success(ret);
    }

    public Result delete(String dsName, String resource, String condition) {
        SqlSession session = sqlMap.getSession(dsName);
        if (session == null) {
            return Result.Fail(ErrorCode.DataSourceNotFound);
        }
        int ret = commonMapper.delete(session, resource, condition);
        return Result.Success(ret);
    }
}
