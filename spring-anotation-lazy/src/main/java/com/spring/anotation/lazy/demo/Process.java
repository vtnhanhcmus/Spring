package com.spring.anotation.lazy.demo;

public class Process {

    private final String processName;

    public Process(String processName) {
        this.processName = processName;
        System.out.println(processName + " initialized!!!");
    }

    public void excute(){
        System.out.println(processName + " running");
    }

}
