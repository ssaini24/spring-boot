//package com.example.springboot.BeanScopes.prototype;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//// on hitting api, you will observe diff hashCode for user class
//
//@Component
//public class Student {
//
//    @Autowired
//    User user;
//
//    public Student(){
//        System.out.println("student init...");
//    }
//
//    public void test(){
//        System.out.println("student hash: " + this.hashCode()
//                + " user hash: " + user.hashCode());
//    }
//}
