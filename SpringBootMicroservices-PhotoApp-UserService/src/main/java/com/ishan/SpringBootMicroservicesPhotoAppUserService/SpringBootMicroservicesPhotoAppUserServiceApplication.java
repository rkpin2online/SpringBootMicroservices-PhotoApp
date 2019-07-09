package com.ishan.SpringBootMicroservicesPhotoAppUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootMicroservicesPhotoAppUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesPhotoAppUserServiceApplication.class, args);
	}

}
