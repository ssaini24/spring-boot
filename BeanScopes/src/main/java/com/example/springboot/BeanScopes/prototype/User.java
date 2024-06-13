//package com.example.springboot.BeanScopes.prototype;
//
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//public class User {
//
//    public User(){
//        System.out.println("user init...");
//    }
//
//    @PostConstruct
//    public void post(){
//        System.out.println("user hash: " + this.hashCode());
//    }
//}
