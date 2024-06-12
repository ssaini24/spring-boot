package com.example.springboot.teaching.requestbinder;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalBindingInit {
    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
    }
}
