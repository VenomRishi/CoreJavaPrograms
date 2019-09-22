package com.bridgelabz.model;

import java.util.List;

public class AddressBookModel {
	private List<PersonModel> persons;
	private String statename;

	public List<PersonModel> getPersons() {
		return persons;
	}

	public void setPersons(List<PersonModel> persons) {
		this.persons = persons;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

}
