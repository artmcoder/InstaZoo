package com.yakunin.instazoo.annotations;

import com.yakunin.instazoo.validations.PasswordMatchersValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchersValidator.class)
@Documented
public @interface PasswordMatchers {
    String message() default "Passwords is not match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
