package com.citylife.devops.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * 注意:
 * TurbineStream工程无法和HystrixDashboard工程共存必须分开
 * 否则会引起Dashboard页面无法显示
 *
 */
@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineServerApplication.class, args);
    }
}
