package com.ishan.SpringBootMicroservicesPhotoAppDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroservicesPhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesPhotoAppDiscoveryServiceApplication.class, args);
	}

}
