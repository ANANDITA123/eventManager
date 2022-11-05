package com.advait.projects.eventManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class EventManagerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EventManagerApplication.class, args);
	}

}
