/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.services;

import java.util.ArrayList;

import com.bridgelabz.model.PersonModel;

public class AddressBookUtil {

	/**
	 * Purpose: method for sorting objects by persons last name
	 * 
	 * @param persons input from user
	 * @return returns the sorted persons list
	 */
	public static ArrayList<PersonModel> sortByLastName(ArrayList<PersonModel> persons) {
		for (int i = 0; i < persons.size() - 1; i++) {
			for (int j = 0; j < persons.size() - i - 1; j++) {

				if (persons.get(j).getLastname().compareTo(persons.get(j + 1).getLastname()) > 0) {
					Object temp = persons.get(j);
					persons.set(j, persons.get(j + 1));
					persons.set(j + 1, (PersonModel) temp);

				}
			}
		}
		return persons;
	}

	/**
	 * Purpose: method for sorting objects by persons zip id
	 * 
	 * @param persons input from user
	 * @return returns the sorted persons list
	 */
	public static ArrayList<PersonModel> sortByZip(ArrayList<PersonModel> persons) {
		for (int i = 0; i < persons.size() - 1; i++) {
			for (int j = 0; j < persons.size() - i - 1; j++) {

				if (persons.get(j).getAddressObj().getZip() > persons.get(j + 1).getAddressObj().getZip()) {
					Object temp = persons.get(j);
					persons.set(j, persons.get(j + 1));
					persons.set(j + 1, (PersonModel) temp);

				}
			}
		}
		return persons;
	}

	/**
	 * Purpose: Printing person detail
	 * 
	 * @param persons   input from user
	 * @param statename input from user
	 * @return returns string output to print
	 */
	public static String PrintPersonDetails(ArrayList<PersonModel> persons, String statename) {
		String str = "";
		str += "Person detail\n";
		for (int i = 0; i < persons.size(); i++) {
			if (!statename.isEmpty() && statename.equals(persons.get(i).getAddressObj().getState())) {
				str += persons.get(i).getFirstname() + " ";
				str += persons.get(i).getLastname() + " ";
				str += persons.get(i).getAddressObj().getAddressLocal() + " ";
				str += persons.get(i).getAddressObj().getCity() + " ";
				str += persons.get(i).getAddressObj().getState() + " ";
				str += persons.get(i).getAddressObj().getZip() + " ";
				str += persons.get(i).getMobile() + " \n";
			}

		}
		return str;
	}

}
