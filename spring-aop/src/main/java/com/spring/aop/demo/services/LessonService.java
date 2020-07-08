package com.spring.aop.demo.services;

import com.spring.aop.demo.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public String showLesson(){
        return lessonRepository.print();
    }

}
