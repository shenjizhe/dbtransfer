package com.bfec.transfer.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import java.util.Map;

/**
 * @author shenjizhe
 * @date 2019/3/14 14:22
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {
    @Bean
    @ConditionalOnMissingBean(MyHikariDataSource.class)
    public MyHikariDataSource dataSource() {
        DataSourceInfo info = new DataSourceInfo();
//        info.setUrl(url);
//        info.setUsername(userName);
//        info.setPassword(password);
        HikariDataSource dataSource = DataSourceProvider.create(info);
        MyHikariDataSource hikariCPDataSource = new MyHikariDataSource();
        hikariCPDataSource.updateDataSourceMap("1", dataSource);
        return hikariCPDataSource;
    }

}