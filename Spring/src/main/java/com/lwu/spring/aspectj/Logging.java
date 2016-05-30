package com.lwu.spring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Leon on 5/30/16.
 */
@Aspect
@Component
public class Logging{

    @Pointcut("execution(* com.lwu.spring.aspectj.*.*(..))")
    private void selectAll(){}

    @Around("selectAll()")
    private void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before + " + joinPoint.getSignature().getName());
        joinPoint.proceed();
        System.out.println("After + " + joinPoint.getSignature().getName());
    }

//    @Before("selectAll()")
//    private void beforeAdvice() {
//        System.out.println("Going to setup student profile.");
//    }
//
//    @After("selectAll()")
//    private void afterAdvice() {
//        System.out.println("Student profile has been setup.");
//    }

//    @AfterReturning(pointcut = "selectAll()", returning="retVal")
//    public void afterReturningAdvice(Object retVal){
//        System.out.println("Returning:" + retVal.toString() );
//    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
     */
//    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
//    public void AfterThrowingAdvice(IllegalArgumentException ex){
//        System.out.println("There has been an exception: " + ex.toString());
//    }
}
