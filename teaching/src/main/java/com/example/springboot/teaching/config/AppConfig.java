package com.example.springboot.teaching.config;

import com.example.springboot.teaching.service.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // you must return created bean else it would not be found by IOC for injection
    @Bean
    public User createUserBean(){
        return new User("parametrized user bean created...");
    }
}
