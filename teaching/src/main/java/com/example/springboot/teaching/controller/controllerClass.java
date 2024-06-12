package com.example.springboot.teaching.controller;

import com.example.springboot.teaching.FirstNamePropertyEditor;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerClass {

    @InitBinder
    protected void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class, new FirstNamePropertyEditor());
    }

    @GetMapping(path = "/test")
    public String test(@RequestParam(value = "firstName") String firstName){
        return "testing #1 API name: " + firstName;
    }
}
