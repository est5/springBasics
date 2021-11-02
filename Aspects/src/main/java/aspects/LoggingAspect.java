package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    //AspectJ /return type , package , class , method , parameters
    @Around("execution(* services.*.publishComment(..))")
    /*ProceedingJoinPoint represents intercepted method(in this case
    any method in any class inside services package)*/
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method " + methodName
                + " with parameters" + Arrays.asList(args) + " will execute");
        /*Comment comment = new Comment();
        comment.setText("Another message");
        comment.setAuthor("Another author");
        Object[] newArgs = {comment}; // Possible to change args*/
        Object returnedByMethod = joinPoint.proceed();//Call to the intercepted method

        logger.info("Method executed and returned " + returnedByMethod);
        return returnedByMethod;
    }

}
