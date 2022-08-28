package com.example.springFeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeign2Application.class, args);
	}

}
