package com.southern.cmps.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.southern.cmps")
public class CmpsApplication {
	
	public static void main(String[] args) {
		
		SpringApplication cmpsApplication = new SpringApplication(CmpsApplication.class);
		cmpsApplication.run();
	}

}
