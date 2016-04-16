package com.mrcos.helloworld;

public class Person {

	private int id;
	private String name;
	private String city;
	private int taxId;
	private Address address;

	public Person() {
		// TODO Auto-generated constructor stub
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

	public Person(int id, String name, String city, Address address, int taxId) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
		this.taxId = taxId;
	}
	
	
	
	void init(){
		System.out.println("Person bean created: "+this);
	}

	@org.junit.Test
	public void speak() {
		System.out.println("I am a person");
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", taxId=" + taxId
				+ "]";
	}
	
	public void onCreate(){
		System.out.println("person Creaed: "+this);
	}
	
	public void onDestory(){
		System.out.println("Person Destroyed"+this);
	}

}
