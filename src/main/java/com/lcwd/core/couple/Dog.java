package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("dog")//it is used to declare a bean
@Component    //both method can be used this and above
//@Qualifier("dog")

public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
