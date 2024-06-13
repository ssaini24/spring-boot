package com.example.springboot.BeanScopes.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// on hitting api, you will observe same hashCode for user class for single http request

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentClass {

    @Autowired
    UserClass user;

    public StudentClass(){
        System.out.println("student init...");
    }

    public void test(){
        System.out.println("student hash: " + this.hashCode()
                + " user hash: " + user.hashCode());
    }
}
