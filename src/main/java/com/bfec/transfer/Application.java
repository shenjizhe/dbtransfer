package com.bfec.transfer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序的入口
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.hellospring.mapper")
@EnableScheduling
public class Application {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}
