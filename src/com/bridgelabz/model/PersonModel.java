package com.bridgelabz.model;

public class PersonModel {
	private String firstname;
	private String lastname;
	private Address address;
	private String mobile;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "PersonModel [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", mobile="
				+ mobile + "]";
	}

}
