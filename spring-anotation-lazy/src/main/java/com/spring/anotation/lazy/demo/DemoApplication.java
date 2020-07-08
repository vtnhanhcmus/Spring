package com.spring.anotation.lazy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean("process1")
	public Process process1(){
		return new Process("Process 1");
	}


	@Bean("process2")
	public Process process2(){
		return new Process("Process 2");
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Application context initialized");

		Process process1 = applicationContext.getBean("process1", Process.class);
		process1.excute();

		Process process2 = applicationContext.getBean("process2", Process.class);
		process2.excute();

	}

}
