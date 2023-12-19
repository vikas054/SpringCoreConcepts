package com.lcwd.core.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")   //here we can defing the scope of bean
public class Pepsi {

    @Autowired
    private Soda soda;

    public Pepsi(){
        System.out.println("Creationg PEPSi");
    }

    public void drink(){
        System.out.println("Pepsi is very cool");
    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }
}
