package com.mrcos.helloworld;

public class PersonFactory {
	public Person createPerson(int id,String name){
		System.out.println("I am from personfactory created");
		return new Person(id,name);
	}
}
