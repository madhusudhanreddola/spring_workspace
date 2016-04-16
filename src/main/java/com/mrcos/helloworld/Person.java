package com.mrcos.helloworld;

public class Person {

	private int id;
	private String name;
	private String city;
	
	private int taxId;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@org.junit.Test
	public void speak() {
		System.out.println("I am a person");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", taxId=" + taxId + "]";
	}

}
