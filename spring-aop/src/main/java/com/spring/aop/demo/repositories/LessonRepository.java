package com.spring.aop.demo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class LessonRepository {

    public String print(){
        return "Lession";
    }
}
