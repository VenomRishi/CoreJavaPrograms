package com.bridgelabz.model;

import java.util.List;

public class AddressBookModel {
	private List<AddressBook> addressbook;

	public List<AddressBook> getAddressbook() {
		return addressbook;
	}

	@Override
	public String toString() {
		return "AddressBookModel [addressbook=" + addressbook + "]";
	}

	public void setAddressbook(List<AddressBook> addressbook) {
		this.addressbook = addressbook;
	}

}
