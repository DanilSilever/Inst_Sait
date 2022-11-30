package com.example.Inst_Sait.annotations;

import com.example.Inst_Sait.validations.PasswordMatchesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    String message () default "Password dont match";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
