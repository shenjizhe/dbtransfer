package com.bfec.transfer.service;

import com.bfec.common.enums.ErrorCode;
import com.bfec.common.util.Result;
import com.bfec.transfer.mapper.CommonMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Playerhistory的Service
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CommonService {

    @Autowired
    CommonMapper commonMapper;
    @Autowired
    SqlSession session;


    public Result select(Map request) throws SQLException {
        String dbName = (String) request.get("db");
        ArrayList array = (ArrayList) commonMapper.select(session, request);
        return Result.Success(array);
    }

    public List sum(Map request) {
        return commonMapper.sum(session, request);
    }

    public List count(Map request) {
        return commonMapper.count(session, request);
    }

    public Result add(String resource, Map request) throws SQLException {
        String dbName = (String) request.get("db");
        int ret = commonMapper.insert(session, resource, request);
        if (ret == 1) {
            return Result.Success();
        } else {
            return Result.Fail(ErrorCode.Fail);
        }
    }

    public Result change(String resource, Map request, String condition) {
        String dbName = (String) request.get("db");
        int ret = commonMapper.update(session, resource, request, condition);
        return Result.Success(ret);
    }

    public Result delete(String resource, String condition) {
        int ret = commonMapper.delete(session, resource, condition);
        return Result.Success(ret);
    }
}
