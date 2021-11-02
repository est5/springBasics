package annotatedAspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")

    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security aspect: calling method");
        Object returnedValue = joinPoint.proceed();

        logger.info("Security aspect: method executed and returned " + returnedValue);
        return returnedValue;
    }

}
