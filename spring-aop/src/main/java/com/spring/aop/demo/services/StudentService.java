package com.spring.aop.demo.services;

import com.spring.aop.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String showStudent(){
        return studentRepository.print();
    }

}
