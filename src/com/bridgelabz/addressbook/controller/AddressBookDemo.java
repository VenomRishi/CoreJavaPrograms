package com.bridgelabz.addressbook.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.addressbook.model.Address;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.model.Person;
import com.bridgelabz.addressbook.repository.JsonUtil;
import com.bridgelabz.utility.OOPsUtility;

public class AddressBookDemo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		AddressBookModel model = new AddressBookModel();

		String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/addressbookout.json";

		ArrayList<Person> persons = new ArrayList<Person>();

		// adding person

		Person person = new Person();
		Person person2 = new Person();

		person.setFirstname("Rishikesh");
		person.setLastname("zhatre");
		Address address = new Address();
		address.setCity("panvel");
		address.setState("mh");
		address.setZip(410206);
		person.setAddressObj(address);
		long mobile = 885022255;
		person.setMobile(mobile);

		person2.setFirstname("Vishnu");
		person2.setLastname("shelke");
		Address address2 = new Address();
		address2.setCity("latur");
		address2.setState("mh");
		address2.setZip(414030);
		person2.setAddressObj(address2);
		person2.setMobile((long) 775533355);

		persons.add(person);
		persons.add(person2);

		model.setPersons(persons);
		// model.setStatename("mh");

		// edit person

		System.out.println("Enter Persons mobile number you want to edit:");
		Long search = OOPsUtility.longScanner();
		int indexOfPerson = 0;
		boolean isFoundPerson = false;
		for (int i = 0; i < persons.size(); i++) {
			if (search == persons.get(i).getMobile()) {
				isFoundPerson = true;
				indexOfPerson = i;
				System.out.println("Person found");
				break;
			}
		}

		if (isFoundPerson) {
			persons.get(indexOfPerson).getAddressObj().setCity("new panve");
			persons.get(indexOfPerson).getAddressObj().setZip(410207);
			persons.get(indexOfPerson).setMobile((long) 1234567890);
			;
			System.out.println("Edit completed");
		} else
			System.out.println("Person not found");

		// delete person

		// commenting because dont want to delete now

//		System.out.println("Enter Persons mobile number you want to delete:");
//		search = OOPsUtility.stringScanner();
//		
//		for (int i = 0; i < persons.size(); i++) {
//			if (search.equals(persons.get(i).getMobile())) {
//				isFoundPerson = true;
//				indexOfPerson = i;
//				System.out.println("Person found");
//				break;
//			}
//		}
//		
//		if (isFoundPerson) {
//			persons.remove(indexOfPerson);
//			System.out.println("Person deleted");
//		}else
//			System.out.println("Person not found");

		// sorting by last name

		for (int i = 0; i < persons.size() - 1; i++) {
			for (int j = 0; j < persons.size() - i - 1; j++) {

				if (persons.get(j).getLastname().compareTo(persons.get(j + 1).getLastname()) > 0) {
					Object temp = persons.get(j);
					persons.set(j, persons.get(j + 1));
					persons.set(j + 1, (Person) temp);

				}
			}
		}
		model.setPersons(persons);

		// sorting by zip

		for (int i = 0; i < persons.size() - 1; i++) {
			for (int j = 0; j < persons.size() - i - 1; j++) {

				if (persons.get(j).getAddressObj().getZip() > persons.get(j + 1).getAddressObj().getZip()) {
					Object temp = persons.get(j);
					persons.set(j, persons.get(j + 1));
					persons.set(j + 1, (Person) temp);

				}
			}
		}
		model.setPersons(persons);

		JsonUtil.writeMapper(path, model);

	}

}
