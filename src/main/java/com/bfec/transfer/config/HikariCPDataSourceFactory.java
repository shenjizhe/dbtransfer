package com.bfec.transfer.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * @author szs
 * @date 2019/3/14 14:24
 */
@Component
public class HikariCPDataSourceFactory{

    @Autowired
    private MyHikariDataSource dataSource;
    @Autowired
    SqlSessionFactory factory;

    public SqlSession getSession(String key) throws SQLException {
        HikariDataSource hikariDataSource = dataSource.switchSource(key);
        SqlSession sqlSession = factory.openSession(dataSource.getConnection());
        return sqlSession;
    }
}