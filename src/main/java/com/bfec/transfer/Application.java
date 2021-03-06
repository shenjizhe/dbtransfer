package com.bfec.transfer;

import com.bfec.common.enums.OperationType;
import com.bfec.transfer.transfer.TransferDestination;
import com.bfec.transfer.transfer.TransferFactory;
import com.bfec.transfer.transfer.TransferItem;
import com.bfec.transfer.transfer.TransferSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.util.ArrayList;
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
@EnableConfigurationProperties(DataSourceProperties.class)
public class Application {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}
