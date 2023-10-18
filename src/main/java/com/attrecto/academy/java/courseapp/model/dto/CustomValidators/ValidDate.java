package com.attrecto.academy.java.courseapp.model.dto.CustomValidators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotBlank;



//Annotáció létrehozása
@NotBlank
@Constraint(validatedBy=ValidDateValidator.class)//ebben a class-ban van a logika
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDate  {
    String message() default "{com.attrecto.academy.java.courseapp.model.dto.CustomValidators.ValidDate.message}";
    Class[] groups() default {};
    Class[] payload() default {};

}

