package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("Creating Student");
    }
    public void detail(){
        System.out.println("I am student detail");
    }
}
