package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PocApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocApiGatewayApplication.class, args);
	}

}
