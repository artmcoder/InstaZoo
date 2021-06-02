package com.yakunin.instazoo.validations;

import com.yakunin.instazoo.annotations.PasswordMatchers;
import com.yakunin.instazoo.payload.request.SingUpRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchersValidator implements ConstraintValidator<PasswordMatchers, Object> {
   public void initialize(PasswordMatchers constraint) {
   }

   public boolean isValid(Object obj, ConstraintValidatorContext context) {
      SingUpRequest userSingUpRequest = (SingUpRequest) obj;
      return userSingUpRequest.getPassword().equals(userSingUpRequest.getConfirmPassword());
   }
}
