package com.spring.aop.demo.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String print(){
        logger.info("processing student repository");
        return "Student";
    }
}
