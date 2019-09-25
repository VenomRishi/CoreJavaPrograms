package com.bridgelabz.services;

import java.io.FileNotFoundException;

public interface IAddressBookUtil {
	void readJson();
	void createNewAddressBook();
	
	void addPerson();
	void editPerson();
	void deletePerson();
	void sortByLastName();
	void sortByZip();
	
	
	void openAddressBook();
	
	void save();
	void saveAs() throws FileNotFoundException;
}
