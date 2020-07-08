package com.spring.aop.demo.services;

import com.spring.aop.demo.anotations.TimeExecute;
import com.spring.aop.demo.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentRepository studentRepository;

    @TimeExecute
    public String showStudent(){
        logger.info("processing student service ");
        return studentRepository.print();
    }

}
