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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.AddressBookModel;
import com.bridgelabz.model.PersonModel;
import com.bridgelabz.repository.JsonUtil;

public class AddressBookUtil implements IAddressBookUtil {
	Scanner scanner = new Scanner(System.in);
	int counter = 0;
	String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/addressbook2.json";
	String statename = "";
	AddressBookModel model = new AddressBookModel();
	ArrayList<PersonModel> persons = new ArrayList<PersonModel>();

	String search;
	int indexOfPerson;

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

	@Override
	public void readJson() {
		// checking whether it is empty or not
		File file = new File(path);
		if (file.exists() && file.length() != 0) {
			try {
				model = (AddressBookModel) JsonUtil.readMapper(path, model);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			persons.addAll(model.getPersons());
			counter = persons.size();

		}

	}

	@Override
	public void createNewAddressBook() {
		System.out.println("-----------------------New Address Book-----------------------");
		System.out.println("Enter state name: ");

		statename = scanner.next();

		boolean isFoundState = false;
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getAddressObj().getState().equals(statename)) {
				isFoundState = true;
				break;
			}
		}
		if (!isFoundState) {

			System.out.println("->State is added<-");
			boolean close = false;

			while (!close) {
				System.out.println(
						"Select option: \n1.add\n2.edit\n3.delete\n4.sort by last name\n5.sort by zip\n6.print\n7.close");
				int ch = scanner.nextInt();
				switch (ch) {
				case 1:
					// add person
					addPerson();

					break;
				case 2:
					// edit person
					editPerson();
					break;
				case 3:
					// delete person
					deletePerson();
					break;
				case 4:
					// sort by last name

					sortByLastName();

					break;
				case 5:
					// sort by zip

					sortByZip();

					break;
				case 6:
					// print

					if (counter > 0) {
						System.out.println("Printing all records...");

						System.out.println(AddressBookUtil.PrintPersonDetails(persons, statename));

					} else
						System.out.println("There is no record to print...");

					break;
				case 7:
					// close
					close = true;
					System.out.println("Closing...");
					break;
				default:
					System.out.println("Invalid option");
				}
			}
		} else
			System.out.println("State exist please try again");

		System.out.println("-----------------------New Address Book-----------------------");

	}

	@Override
	public void openAddressBook() {
		System.out.println("-----------------------Open Address Book-----------------------");
		HashMap<String, String> map = new HashMap<>();
		;
		for (int i = 0; i < persons.size(); i++) {
			map.put(persons.get(i).getAddressObj().getState(), persons.get(i).getAddressObj().getState());
		}
		System.out.println("states available " + map.keySet());
		System.out.println("Enter state");
		statename = scanner.next();
		boolean isFoundState = false;
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getAddressObj().getState().equals(statename)) {
				isFoundState = true;
				break;
			}
		}
		if (isFoundState) {
			System.out.println("->State is found<-");
			boolean close2 = false;

			while (!close2) {
				System.out.println(
						"Select option: \n1.add\n2.edit\n3.delete\n4.sort by last name\n5.sort by zip\n6.print\n7.quit");
				switch (scanner.nextInt()) {
				case 1:
					// add person
					addPerson();
					break;
				case 2:
					// edit person
					editPerson();
					break;
				case 3:
					// delete person
					deletePerson();
					break;
				case 4:
					// sort by last name
					sortByLastName();

					break;
				case 5:
					// sort by zip
					
					sortByZip();

					break;
				case 6:
					// print
					if (counter > 0) {
						System.out.println("Printing all records...");

						System.out.println(AddressBookUtil.PrintPersonDetails(persons, statename));

					} else
						System.out.println("There is no record to print...");

					break;
				case 7:
					// close
					close2 = true;
					System.out.println("Closing...");
					break;
				default:
					System.out.println("Invalid option");
				}
			}

		} else
			System.out.println("Please create new state of that name\nelse try new state name");

		System.out.println("-----------------------Open Address Book-----------------------");

	}

	@Override
	public void save() {
		System.out.println("-----------------------Save Address Book-----------------------");

		
		
		System.out.println("->Saving address book into json<-");
		model.setPersons(persons);
		try {
			JsonUtil.writeMapper(path, model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Writing into file successful....");

		System.out.println("-----------------------Save Address Book-----------------------");

	}

	@Override
	public void saveAs() throws FileNotFoundException {
		System.out.println("-----------------------Save As Address Book-----------------------");

		System.out.println("->Save as<-");
		System.out.println("This option requires path where you want to store file");
		System.out.println("for continue press (y/n)");
		if (scanner.next().charAt(0) == 'y') {
			System.out.println("Enter the path to store file: ");
			String pathInput = scanner.next();
			// checking whether path is valid or not

			if (pathInput.charAt(pathInput.length() - 1) == '/') {
				System.out.println("please provide file name: ");
				pathInput += scanner.next();
				if (new File(pathInput).exists()) {
					throw new FileNotFoundException("You cannot rewrite existing file");
				} else {
					// writing into file
					System.out.println("->Saving address book into file<-");
					model.setPersons(persons);
					try {
						JsonUtil.writeMapper(pathInput, model);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println();
					System.out.println("Writing into file successful....");
				}

			} else {
				// writing into file
				System.out.println("->Saving address book into file<-");
				model.setPersons(persons);
				try {
					JsonUtil.writeMapper(pathInput, model);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("Writing into file successful....");
			}

		} else
			System.out.println("prefer to choose save option");

		System.out.println("-----------------------Save As Address Book-----------------------");

	}

	@Override
	public void addPerson() {
		System.out.println("Add person details...");
		PersonModel person = new PersonModel();

		System.out.println("Enter mobile");
		String mobile = scanner.next();
		// validating mobile is not taken by anyone
		boolean isMobileTaken = false;
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getMobile().equals(mobile)) {
				isMobileTaken = true;
				break;
			}
		}
		if (isMobileTaken) {
			System.out.println("This mobile number is already taken");
		} else {
			person.setMobile(mobile);
			System.out.println("Enter person first name: ");
			person.setFirstname(scanner.next().toLowerCase());
			System.out.println("Enter person last name: ");
			person.setLastname(scanner.next().toLowerCase());
			System.out.println("Enter address Details: ");
			Address address = new Address();
			System.out.println("Enter address: ");
			address.setAddressLocal(scanner.next());
			System.out.println("Enter city: ");
			address.setCity(scanner.next());
			address.setState(statename);
			System.out.println("Enter zip: ");
			address.setZip(scanner.nextInt());

			person.setAddressObj(address);

			persons.add(person);

			System.out.println();
			System.out.println("Person added");
			counter++;

		}

	}

	@Override
	public void editPerson() {
		if (counter > 0) {
			System.out.println("Enter Persons mobile number you want to edit:");
			search = scanner.next();
			indexOfPerson = 0;
			boolean isFoundPerson = false;
			for (int i = 0; i < persons.size(); i++) {
				if (search.equals(persons.get(i).getMobile())) {
					isFoundPerson = true;
					indexOfPerson = i;
					break;
				}
			}
			if (isFoundPerson) {

				System.out.println("enter new address");
				persons.get(indexOfPerson).getAddressObj().setAddressLocal(scanner.next());
				System.out.println("enter new city name");
				persons.get(indexOfPerson).getAddressObj().setCity(scanner.next());
				System.out.println("enter new zip");
				persons.get(indexOfPerson).getAddressObj().setZip(scanner.nextInt());

				persons.get(indexOfPerson).setMobile(search);

				System.out.println();
				System.out.println("Edit completed");

			} else
				System.out.println("No person found with this number");
		} else
			System.out.println("There is no record to edit");

	}

	@Override
	public void deletePerson() {
		if (counter > 0) {
			System.out.println("Enter Persons mobile number you want to delete:");
			search = scanner.next();
			indexOfPerson = 0;
			boolean isFoundPerson = false;
			for (int i = 0; i < persons.size(); i++) {
				if (search.equals(persons.get(i).getMobile())) {
					isFoundPerson = true;
					indexOfPerson = i;
					break;
				}
			}
			if (isFoundPerson) {
				persons.remove(indexOfPerson);
				counter--;
				System.out.println();
				System.out.println("Delete completed");
			} else
				System.out.println("No person found with this number");
		} else
			System.out.println("No records to delete");

	}

	@Override
	public void sortByLastName() {
		if (counter > 1) {
			System.out.println("Sorting by Last name is selected");

			persons = AddressBookUtil.sortByLastName(persons);

			System.out.println("Please wait...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Sorting is completed to see the result select print option");
		} else
			System.out.println("Less records to sort");

	}
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

	@Override
	public void sortByZip() {
		if (counter > 1) {
			System.out.println("Sorting by zip");

			persons = AddressBookUtil.sortByZip(persons);

			System.out.println("Please wait...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Sorting is completed to see the result select print option");
		} else
			System.out.println("Less records to sort");

	}
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

}
