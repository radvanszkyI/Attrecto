package com.attrecto.academy.java.courseapp.model.dto.CustomValidators;


import java.util.Date;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

    
public class ValidDateValidator implements ConstraintValidator<ValidDate,Date[]> {
    public void initialize(ValidDate constraintAnn) {}

    public boolean isValid(Date[] value, ConstraintValidatorContext context) {
        //if end(value[1]) later than start(value[0])
        return value[1].compareTo(value[0])>0;

    }
}

