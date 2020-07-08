package com.spring.aop.demo.services;

import com.spring.aop.demo.anotations.TimeExecute;
import com.spring.aop.demo.repositories.LessonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LessonRepository lessonRepository;

    @TimeExecute
    public String showLesson(){
        logger.info("processing lesson service ");
        return lessonRepository.print();
    }

}
