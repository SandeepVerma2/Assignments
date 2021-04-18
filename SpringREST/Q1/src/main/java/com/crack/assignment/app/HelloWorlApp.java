package com.crack.assignment.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.narwal.assignment.controllers")
@EnableAutoConfiguration
public class HelloWorlApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorlApp.class, args);
	}
	
}
