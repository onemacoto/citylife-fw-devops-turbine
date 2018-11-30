package com.citylife.devops.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.cloud.netflix.turbine.stream.TurbineStreamAutoConfiguration;
//import org.springframework.kafka.annotation.EnableKafka;

/**
 * 注意: TurbineStream工程无法和HystrixDashboard工程共存必须分开 否则会引起Dashboard页面无法显示
 *
 */
@SpringBootApplication(exclude = { TurbineStreamAutoConfiguration.class })
@EnableTurbineStream
@EnableEurekaClient
public class TurbineServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineServerApplication.class, args);
	}
}
