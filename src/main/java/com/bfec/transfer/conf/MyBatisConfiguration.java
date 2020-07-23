package com.bfec.transfer.conf;

import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@MapperScan(basePackages = {"com.bfec.transfer.start.config"})
@AutoConfigureAfter({DataBaseConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)
public class MyBatisConfiguration implements EnvironmentAware {

    private static Log logger = LogFactory.getLog(MyBatisConfiguration.class);
    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "mybatis.");
    }
    
    private SqlSessionFactory sqlSessionFactory(DataSource ds) {
        try {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(ds);
        factoryBean.setTypeAliasesPackage(
            propertyResolver.getProperty("typeAliasesPackage"));
        factoryBean.setMapperLocations(
            new PathMatchingResourcePatternResolver().getResources(
            propertyResolver.getProperty("mapperLocations")));
        factoryBean.setConfigLocation(
            new DefaultResourceLoader().getResource(
                propertyResolver.getProperty("configLocation")));

        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        org.apache.ibatis.session.Configuration configuration
                = sqlSessionFactory.getConfiguration();
            configuration.setMapUnderscoreToCamelCase(true);
            return sqlSessionFactory;

        } catch (Exception e) {
        logger.warn("Could not confiure mybatis session factory");
        return null;
        }
    }
    @Autowired
    @Qualifier("jdbc_league_data")
    private DataSource jdbc_league_data;

    @Bean(name = "jdbc_league_data_template")
    public SqlSessionTemplate jdbc_league_data_template() {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory(jdbc_league_data));
        return sessionTemplate;
    }
    @Autowired
    @Qualifier("jdbc_guoan_new")
    private DataSource jdbc_guoan_new;

    @Bean(name = "jdbc_guoan_new_template")
    public SqlSessionTemplate jdbc_guoan_new_template() {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory(jdbc_guoan_new));
        return sessionTemplate;
    }
}

