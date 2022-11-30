package com.example.Inst_Sait.validations;

import com.example.Inst_Sait.annotations.PasswordMatches;
import com.example.Inst_Sait.payload.request.SignUpRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator <PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        SignUpRequest userSighUpRequest = (SignUpRequest) obj;

        return userSighUpRequest.getPassword().equals(userSighUpRequest.getConfirmPassword());
    }
}
