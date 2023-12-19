package com.lcwd.core;

import com.lcwd.core.couple.*;
import com.lcwd.core.scope.Pepsi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import test.Test;

import java.sql.SQLOutput;

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


		// we can create multiple context in a spring application
		ApplicationContext applicationContext = SpringApplication.run(SpringCoreConceptsApplication.class, args);
//		Person personBean = applicationContext.getBean(Person.class);
//		personBean.playWithAnimal();

		/*Test test = applicationContext.getBean(Test.class);
		test.testing();*/

//		Animal cat = applicationContext.getBean("cat",Animal.class);
//		Animal dog = applicationContext.getBean("dog",Animal.class);
//		cat.play();
//		dog.play();

		//Bean Scope
		//First request for Pepsi Bean
		Pepsi pepsi = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsi);
		pepsi.drink();

		Pepsi pepsi2 = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsi2);
		pepsi2.drink();

		System.out.println("ended");
	}
//declaring the bean using @Bean
	/*@Bean
	public Samosa getSamosa(){
		return new Samosa();
	}*/
	/*@Bean(name = "samosa1")  // here we can change the bean name using name tag;
	//@Primary	// two bean can not give same object, in this case we need to add @Primary annotation to set prority
	public Samosa getSamosa1(){
		return new Samosa("Tandoori Samosa");
	}
	@Bean(name = "samosa2")
	public Samosa getSamosa2(){
		return new Samosa("Meetha Samosa");
	}*/
}
