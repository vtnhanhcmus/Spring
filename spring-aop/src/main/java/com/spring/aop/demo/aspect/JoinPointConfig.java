package com.spring.aop.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

    @Pointcut("execution(* com.spring.aop.demo.repositories.*.*(..))")
    public void repositoryExecute(){}

    @Pointcut("execution(* com.spring.aop.demo.services.*.*(..))")
    public void serviceExecute(){}

    @Pointcut("@annotation(com.spring.aop.demo.anotations.TimeExecute)")
    public void trackingTimeMethod(){}


}
