package com.spring.aop.demo.repositories;

import com.spring.aop.demo.anotations.TimeExecute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LessonRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @TimeExecute
    public String print(){
        logger.info("processing repository lesson");
        return "Lession";
    }
}
