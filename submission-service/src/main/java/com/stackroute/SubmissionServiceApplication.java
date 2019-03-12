package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//@EnableConfigClient
@SpringBootApplication
public class SubmissionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubmissionServiceApplication.class, args);
	}

}
