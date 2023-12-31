package com.batch.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchExApplication.class, args);
    }

}
