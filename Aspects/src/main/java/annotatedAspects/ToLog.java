package annotatedAspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // enables annotation to be intercepted at runtime
@Target(ElementType.METHOD)//restrict annotation to methods
public @interface ToLog {
}
