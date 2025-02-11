package com.project.custom_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/custom-annotation")
@Validated
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @PostMapping
    public  String customAnnotation(@RequestBody @Valid Employer employer){
        employerService.save();
        return "";
    }
}
