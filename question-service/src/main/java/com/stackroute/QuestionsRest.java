package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.stereotype.Component;

//@Component
@CrossOrigin("*")
@EnableEurekaClient
@EnableConfigClient
@SpringBootApplication
public class QuestionsRest {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsRest.class, args);
	}
}