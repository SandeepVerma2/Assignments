package com.crack.assignment2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.narwal.assignment2.controllers")
@EnableAutoConfiguration
public class AuthenticationApp {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApp.class, args);
	}
	
}
