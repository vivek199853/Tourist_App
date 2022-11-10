package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;

@SpringBootApplication
@EnableEurekaClient
public class ApiGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway1Application.class, args);
	}
	

}
