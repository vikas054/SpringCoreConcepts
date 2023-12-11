package com.lcwd.core.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("cat")
@Component
@Primary
public class Cat implements Animal {
    public void play(){
        System.out.println("Cat is playing");
    }

}
