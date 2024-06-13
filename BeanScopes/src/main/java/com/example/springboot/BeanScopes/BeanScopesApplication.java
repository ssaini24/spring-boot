package com.example.springboot.BeanScopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example")
@SpringBootApplication
public class BeanScopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanScopesApplication.class, args);
	}
}
