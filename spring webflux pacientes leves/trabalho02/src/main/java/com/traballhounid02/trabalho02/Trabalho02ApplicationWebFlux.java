package com.traballhounid02.trabalho02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class Trabalho02ApplicationWebFlux {
	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(Trabalho02ApplicationWebFlux.class, args);
	}

}
 