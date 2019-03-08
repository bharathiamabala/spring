package com.spring.autowire;

public class Address {
	private String street;
	private String loc;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", loc=" + loc + "]";
	}

	/*public Address(String street, String loc) {
		super();
		this.street = street;
		this.loc = loc;
	}*/
	
	
	
}
