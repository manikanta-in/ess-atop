package com.mbusa.atop.aspect;

import org.apache.log4j.lf5.LogLevel;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {



    private static final Logger LOG = Logger.getLogger(LoggingAspect.class.getName());

    /*
     *   What kind of method calls I would intercept
     *   execution(* PACKAGE.*.*(..))
     *   @Before : We would want to execute the Aspect before the execution of the method
     */
    @Before(value = "execution(* com.mbusa.atop.services.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        LOG.info("LoggingAspect.beforeAdvice Method "+joinPoint.getSignature());
    }
    /*
     *   @After: executed in two situations — when a method executes successfully or it throws an exception.
     */
    @After(value = "execution(* com.mbusa.atop.services.*.*(..))")
    public void after(JoinPoint joinPoint) {
        LOG.info("LoggingAspect.after execution of {} "+joinPoint);
    }

    /*
     *   AspectJ @AfterThrowing advice is executed after a join point does not complete normally and end up throwing an exception
     */
    @AfterThrowing(pointcut = "execution(* com.mbusa.atop.services.*.*(..))", throwing = "ex")
    public void logAfterThrowingAllMethods(Exception ex) throws Throwable
    {
    	 LOG.log(Level.WARNING,"LoggingAspect.logAfterThrowingAllMethods() " + ex);
    }
}
