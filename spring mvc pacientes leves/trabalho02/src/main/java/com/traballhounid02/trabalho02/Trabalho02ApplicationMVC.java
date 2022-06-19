package com.traballhounid02.trabalho02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient	
public class Trabalho02ApplicationMVC {

	public static void main(String[] args) {
		SpringApplication.run(Trabalho02ApplicationMVC.class, args);
	}

}
 