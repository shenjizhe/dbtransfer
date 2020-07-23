//package com.bfec.transfer.conf;
//
//import java.beans.PropertyVetoException;
//import javax.sql.DataSource;
//import org.springframework.boot.bind.RelaxedPropertyResolver;
//import org.springframework.context.EnvironmentAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.env.PropertyResolver;
//@Configuration
//@EnableTransactionManagement
//public class DataBaseConfiguration implements EnvironmentAware {
//    private RelaxedPropertyResolver jdbc_league_dataPR;
//    private RelaxedPropertyResolver jdbc_guoan_newPR;
//
//
//    @Override
//    public void setEnvironment(Environment env) {
//        this.jdbc_league_dataPR = new RelaxedPropertyResolver(env, "jdbc_league_data.");
//        this.jdbc_guoan_newPR = new RelaxedPropertyResolver(env, "jdbc_guoan_new.");
//    }
//
//    @Bean(name = "jdbc_league_data")
//    @Primary
//    public DataSource jdbc_league_data() throws PropertyVetoException {
//        return getDataSource(jdbc_league_dataPR);
//    }
//    @Bean(name = "jdbc_guoan_new")
//    public DataSource jdbc_guoan_new() throws PropertyVetoException {
//        return getDataSource(jdbc_guoan_newPR);
//    }
//
//    private DataSource getDataSource(PropertyResolver resolver) throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setJdbcUrl(resolver.getProperty("JdbcUrl"));
//        dataSource.setDriverClass(resolver.getProperty("DriverClass"));
//        dataSource.setUser(resolver.getProperty("User"));
//        dataSource.setPassword(resolver.getProperty("Password"));
//        dataSource.setInitialPoolSize(5);
//        dataSource.setMinPoolSize(2);
//        dataSource.setMaxPoolSize(10);
//        dataSource.setIdleConnectionTestPeriod(3000);
//        return dataSource;
//    }
//}
//
