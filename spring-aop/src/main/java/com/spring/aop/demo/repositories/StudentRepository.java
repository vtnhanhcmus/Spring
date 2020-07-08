package com.spring.aop.demo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String print(){
        return "Student";
    }
}
