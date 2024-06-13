package com.example.springboot.teaching.service;


// no @component annotation as we do not have default constructor
public class User {

    public User(String name){
        System.out.printf(name);
    }
}
