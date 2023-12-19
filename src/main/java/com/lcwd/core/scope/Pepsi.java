package com.lcwd.core.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")   //here we can defing the scope of bean
//@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)   //here we can defing the scope of bean - new object at every type
public class Pepsi {

    @Autowired
    private Soda soda;   //Proxy mode is used to get the new object at every new injection  and this class will be having the singleton type and it autowired prototype type class.

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
