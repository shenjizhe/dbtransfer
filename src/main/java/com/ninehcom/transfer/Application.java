package com.ninehcom.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序的入口
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);

        app.run(args);
    }
}
