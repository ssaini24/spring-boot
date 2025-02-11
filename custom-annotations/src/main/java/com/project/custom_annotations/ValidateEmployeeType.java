package com.project.custom_annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmployeeTypeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateEmployeeType {
    String message() default "Invalid Employee Type"; // Custom error message
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}