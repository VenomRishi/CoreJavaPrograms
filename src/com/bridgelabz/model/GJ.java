package com.bridgelabz.model;

public class GJ {
	@Override
	public String toString() {
		return "GJ [firstname=" + firstname + ", address=" + address + ", mobile=" + mobile + ", id=" + id
				+ ", lastname=" + lastname + "]";
	}

	private String firstname;

	private Address address;

	private String mobile;

	private String id;

	private String lastname;

	public String statename;

	public String getStatename() {
		return "dl";
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
