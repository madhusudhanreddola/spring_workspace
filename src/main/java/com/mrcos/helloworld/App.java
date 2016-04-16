package com.mrcos.helloworld;

import java.beans.PropertyEditor;
import java.security.AccessControlContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringValueResolver;

public class App{

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
		person.setTaxId(10);
		System.out.println(person);
		
		
		
		Person person1=context.getBean("person",Person.class);		
		System.out.println(person1);
		
		Address address=context.getBean("address", Address.class);
		System.out.println(address);
		address.setPostcode("07109");
		System.out.println(address);
		
		Address address1=context.getBean("address", Address.class);
		System.out.println(address1);
	

		// ((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}



}
