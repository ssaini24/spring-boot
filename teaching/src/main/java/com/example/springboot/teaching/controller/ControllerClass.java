package com.example.springboot.teaching.controller;

import com.example.springboot.teaching.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @Autowired
    User user;

    @GetMapping(path = "/test")
    public String test(@RequestParam(name = "firstName") String firstName){
        System.out.println("getting request...");
        System.out.printf("user bean created using @bean: " + user.toString());
        return "testing #1 API name: " + firstName;
    }
}
