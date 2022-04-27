package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.config.*;

public class SpringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p1 = (Person)context.getBean("person");
		
		System.out.println(p1.getFirstName());	

//Person p2 = (Person)context.getBean("person2");
		
		System.out.println(p1.getFirstName()+":"+p1.getAge());
		
Car car1 = (Car)context.getBean("car1");
		
		System.out.println(car1.getMake());	
		System.out.println(p1.getCarDetails());
		
	}

}
