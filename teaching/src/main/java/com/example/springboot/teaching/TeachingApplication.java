package com.example.springboot.teaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.springboot.teaching")
@SpringBootApplication
public class TeachingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TeachingApplication.class, args);
//		applicationContext.stop();
	}
}
