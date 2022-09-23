package com.sdsa.bmp.service.gwy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServiceGwyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceGwyApplication.class, args);
	}

}
