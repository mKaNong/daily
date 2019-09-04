package com.ahdy.xem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka8003Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka8003Application.class, args);
    }
}
