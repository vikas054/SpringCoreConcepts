package com.lcwd.core;

import com.lcwd.core.couple.Animal;
import com.lcwd.core.couple.Cat;
import com.lcwd.core.couple.Dog;
import com.lcwd.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import test.Test;

@SpringBootApplication
//@ComponentScan(basePackages = {"package1"."package2","package2"})
@ComponentScan(basePackages = {"com.lcwd.core","test"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		System.out.println("started");
		//Animal animal = new Dog();
//		Animal animal = new Cat();
//		Animal animal1 = new Dog();
//		Person p = new Person(animal);
//		Person p1 = new Person(animal1);
//		p.playWithAnimal();
//		p1.playWithAnimal();

		//where to  scan for beans
		//@ComponentScan(basePackages = {"package1"."pakage2","pakage2"})



		ApplicationContext applicationContext = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person personBean = applicationContext.getBean(Person.class);
		personBean.playWithAnimal();

		Test test = applicationContext.getBean(Test.class);
		test.testing();

//		Animal cat = applicationContext.getBean("cat",Animal.class);
//		Animal dog = applicationContext.getBean("dog",Animal.class);
//		cat.play();
//		dog.play();
		System.out.println("ended");
	}

}
