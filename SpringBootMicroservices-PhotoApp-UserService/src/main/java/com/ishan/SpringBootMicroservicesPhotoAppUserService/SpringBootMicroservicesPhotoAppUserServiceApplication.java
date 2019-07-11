package com.ishan.SpringBootMicroservicesPhotoAppUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootMicroservicesPhotoAppUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesPhotoAppUserServiceApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
