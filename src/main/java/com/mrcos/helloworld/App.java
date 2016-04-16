package com.mrcos.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Basic way to call something without spring
		 */
		Person p=new Person();
		p.speak();
		
		
		/*
		 * Spring way of calling a method using beans
		 * 
		 * beanfactory 
		 * applicationcontext is a bean container which can instantiate beans
		 */
		
		BeanFactory factory;
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		Person p1=(Person) context.getBean("person");
		p1.speak();
		

	}

}
