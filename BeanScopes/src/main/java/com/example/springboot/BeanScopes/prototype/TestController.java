//package com.example.springboot.BeanScopes.prototype;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//public class TestController {
//
//    @Autowired
//    Student student;
//
//    @Autowired
//    User user;
//
//    public TestController(){
//        System.out.println("test controller init...");
//    }
//
//    @GetMapping(path = "/prototype")
//    public String test(@RequestParam(name = "firstName") String firstName){
//        System.out.println("getting request...");
//        System.out.println("test controller hash: " + this.hashCode() + " student hash: " +
//                student.hashCode() + " user hash: " + user.hashCode());
//        student.test();
//
//        return "testing #1 API name: " + firstName;
//    }
//}
