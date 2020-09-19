package com.example.mindtree.orderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Karunakar Pilli.
 *
 */
//@EnableEurekaClient
@SpringBootApplication
public class OrderdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderdemoApplication.class, args);
	}

}
