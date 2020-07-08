package com.spring.aop.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class ExecuteTimeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around(value = "com.spring.aop.demo.aspect.JoinPointConfig.trackingTimeMethod()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object object = proceedingJoinPoint.proceed();
        long timeExecute = System.currentTimeMillis() - startTime;
        logger.info("Time execute by {} is {} ", proceedingJoinPoint, timeExecute);
        return object;
    }

}
