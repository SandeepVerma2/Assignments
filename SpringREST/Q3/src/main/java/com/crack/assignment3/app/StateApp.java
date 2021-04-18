package com.crack.assignment3.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.narwal.assignment3.controllers, com.narwal.assignment3.services")
@EnableAutoConfiguration
public class StateApp {
	
	public static void main(String[] args) {
		SpringApplication.run(StateApp.class, args);
	}
	
}
