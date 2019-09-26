package com.bridgelabz.model;

public class Person {
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", addressObj=" + addressObj + ", mobile="
				+ mobile + "]";
	}

	private String firstname;
	private String lastname;
	private Address addressObj;
	private Long mobile;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddressObj() {
		return addressObj;
	}

	public void setAddressObj(Address addressObj) {
		this.addressObj = addressObj;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	

}
