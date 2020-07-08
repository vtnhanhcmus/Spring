package com.spring.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After(value = "com.spring.aop.demo.aspect.JoinPointConfig.repositoryExcute()")
    public void after(JoinPoint joinPoint){
        logger.info("After execution {} ", joinPoint);
    }

    @AfterReturning(value = "com.spring.aop.demo.aspect.JoinPointConfig.repositoryExcute()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("After return execute {} ", joinPoint);
        logger.info("After return result {}", result);
    }

}
