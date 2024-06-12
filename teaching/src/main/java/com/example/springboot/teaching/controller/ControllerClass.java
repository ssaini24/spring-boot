package com.example.springboot.teaching.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @GetMapping(path = "/test")
    public String test(@RequestParam(name = "firstName") String firstName){
        System.out.println("getting request");
        return "testing #1 API name: " + firstName;
    }
}
