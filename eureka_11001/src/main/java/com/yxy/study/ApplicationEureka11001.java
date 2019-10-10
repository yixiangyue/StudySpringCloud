package com.yxy.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka11001 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka11001.class);
    }
}
