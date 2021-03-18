package com.subidha;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String zipCode;
	private String city;
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
