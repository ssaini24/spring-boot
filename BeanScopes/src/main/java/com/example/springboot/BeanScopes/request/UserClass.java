package com.example.springboot.BeanScopes.request;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("request")
public class UserClass {

    public UserClass(){
        System.out.println("user init...");
    }

    @PostConstruct
    public void post(){
        System.out.println("user hash: " + this.hashCode());
    }
}
