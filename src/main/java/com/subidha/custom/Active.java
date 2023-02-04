/*
package com.subidha.custom;

import com.subidha.custom.ActiveValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ActiveValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Active {
    String message() default "Invalid value for isActive field";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
*/
