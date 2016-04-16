package com.mrcos.helloworld;

public class Address {
	private String street;
	private String postcode;

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	public Address(){
		
	}
	
	public Address(String street, String postcode) {		
		this.street = street;
		this.postcode = postcode;
	};
	
	void init(){
		System.out.println("bean created: "+this);
	}

}
