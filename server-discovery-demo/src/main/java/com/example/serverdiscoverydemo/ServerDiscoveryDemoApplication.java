package com.example.serverdiscoverydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerDiscoveryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDiscoveryDemoApplication.class, args);
	}

}
