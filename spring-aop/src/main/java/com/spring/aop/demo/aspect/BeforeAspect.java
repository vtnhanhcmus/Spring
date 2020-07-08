package com.spring.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("com.spring.aop.demo.aspect.JoinPointConfig.repositoryExecute()")
    public void before(JoinPoint joinPoint){
        logger.info("before execute function {}", joinPoint);
    }

}
