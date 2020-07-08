package com.spring.aop.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

    @Pointcut("execution(* com.spring.aop.demo.repositories.*.*(..))")
    public void repositoryExcute(){}

}
