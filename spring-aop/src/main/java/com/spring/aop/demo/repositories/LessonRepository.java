package com.spring.aop.demo.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LessonRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String print(){
        logger.info("processing repository lesson");
        return "Lession";
    }
}
