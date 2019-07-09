package com.ishan.SpringBootMicroservicesPhotoAppAccountManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootMicroservicesPhotoAppAccountManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesPhotoAppAccountManagementServiceApplication.class, args);
	}

}
