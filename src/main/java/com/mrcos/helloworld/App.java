package com.mrcos.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
		/*
		 * Basic way to call something without spring
		 */
		Person p = new Person();
		p.speak();
		
		/*
		 * Spring way of calling a method using beans
		 * 
		 * beanfactory applicationcontext is a bean container which can
		 * instantiate beans
		 */
		
		// ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		// ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/com/mrcos/helloworld/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mrcos/helloworld/beans/beans.xml");
		
		//Person person = (Person) context.getBean("person");
		Person person=context.getBean("person",Person.class);
		person.speak();
		System.out.println(person);
		
		
		Address address=context.getBean("address", Address.class);
		System.out.println(address);
		
		

		// ((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}

}
