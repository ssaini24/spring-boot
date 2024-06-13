package com.example.springboot.BeanScopes.request;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class TestControllerClass {

    @Autowired
    StudentClass student;

    @Autowired
    UserClass user;

    public TestControllerClass(){
        System.out.println("test controller init...");
    }

    @GetMapping(path = "/request")
    public String test(@RequestParam(name = "firstName") String firstName){
        System.out.println("getting request...");
        System.out.println("test controller hash: " + this.hashCode() + " student hash: " +
                student.hashCode() + " user hash: " + user.hashCode());
        student.test();

        return "testing #1 API name: " + firstName;
    }
}
