package com.bfec.transfer;

import com.bfec.transfer.transfer.TransferFactory;
import com.bfec.transfer.transfer.TransferItem;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

/**
 * 程序的入口
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.bfec.transfer.mapper")
@EnableScheduling
public class Application {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        saveFile();
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }

    public static void saveFile() {
        TransferFactory transferFactory = new TransferFactory();

    }
}
