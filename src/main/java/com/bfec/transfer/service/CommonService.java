package com.bfec.transfer.service;

import com.bfec.transfer.config.HikariCPDataSourceFactory;
import com.bfec.transfer.config.MyHikariDataSource;
import com.bfec.transfer.mapper.CommonMapper;
import com.bfec.common.enums.ErrorCode;
import com.bfec.common.util.Result;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
    CommonMapper commonMapper;

    @Autowired
    HikariCPDataSourceFactory factory;

    public Result select(Map request) throws SQLException {
        String dbName = (String) request.get("db");
        SqlSession session = factory.getSession(dbName);
        ArrayList array = (ArrayList) commonMapper.select(session, request);
        return Result.Success(array);
    }

    public Result sum(Map request) throws SQLException {
        String dbName = (String) request.get("db");
        SqlSession session = factory.getSession(dbName);
        ArrayList array = (ArrayList) commonMapper.sum(session, request);
        return Result.Success(array);
    }

    public Result count(String dsName, Map request) throws SQLException {
        String dbName = (String) request.get("db");
        SqlSession session = factory.getSession(dbName);
        ArrayList array = (ArrayList) commonMapper.count(session, request);
        return Result.Success(array);
    }

    public Result add(String dsName, String resource, Map request) throws SQLException {
        String dbName = (String) request.get("db");
        SqlSession session = factory.getSession(dbName);
        int ret = commonMapper.insert(session, resource, request);
        if (ret == 1) {
            return Result.Success();
        } else {
            return Result.Fail(ErrorCode.Fail);
        }
    }

    public Result change(String dsName, String resource, Map request, String condition) throws SQLException {
        String dbName = (String) request.get("db");
        SqlSession session = factory.getSession(dbName);
        int ret = commonMapper.update(session, resource, request, condition);
        return Result.Success(ret);
    }

    public Result delete(String dsName, String resource, String condition) throws SQLException {
        SqlSession session = factory.getSession(dsName);
        int ret = commonMapper.delete(session, resource, condition);
        return Result.Success(ret);
    }
}
