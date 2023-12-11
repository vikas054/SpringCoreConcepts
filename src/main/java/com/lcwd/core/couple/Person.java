package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Person {
    @Autowired
    Animal animal;
    @Autowired
    Student student;

    /*@Autowired
    public Person(Animal animal,Student student){
        System.out.println("Calling constructor  : autowiring");
        this.animal = animal;
        this.student = student;
    }

     */
/*
    public Animal getAnimal() {
        return animal;
    }
    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }
    @Autowired//using autowired for field injection.
    public void setStudent(Student student) {
        this.student = student;
    }
*/
    public void playWithAnimal(){
        animal.play();
    }


}
