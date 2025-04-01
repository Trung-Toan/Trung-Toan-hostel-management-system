package t3h.hostelmanagementsystem.validation.email;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidEmailValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
    String message() default "Email must be valid and from allowed domains (gmail.com, yahoo.com, outlook.com, example.vn)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
