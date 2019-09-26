/******************************************************************************
 *  Purpose: Program is written for creating address book
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.controller;

import java.io.IOException;
import java.util.Scanner;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.services.ImplAddressBookUtil;

public class AddressBookManager {

	public static void main(String[] args)
			throws InterruptedException, JsonParseException, JsonMappingException, IOException {
		/*
		 * Address book manager
		 * 
		 * newAddressBook()
		 * 
		 * open()
		 * 
		 * close()
		 * 
		 * save()
		 * 
		 * saveAs()
		 * 
		 * quit()
		 * 
		 */
		ImplAddressBookUtil util = new ImplAddressBookUtil();
		util.readJson();

		Scanner scanner = new Scanner(System.in);

		// getting file if exist and if it is json the reading it again
		// and getting all the objects and lists of json into program

		boolean isExitAddressBook = false;
		System.out.println("Address book manager\n");
		while (!isExitAddressBook) {

			System.out.println("Select menu");
			System.out.println("1. New Address Book\n2. Open Address Book\n" + "3. Save Address Book\n"
					+ "4. SaveAs Address Book\n" + "5. Quit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				// new address book
				util.createNewAddressBook();

				break;
			case 2:
				// open
				// opening address book
				util.openAddressBook();

				break;
			case 3:
				// save
				util.save();
				break;
			case 4:
				// saveAs
				util.saveAs();
				break;
			case 5:
				// quit
				System.out.println("-----------------------Quit Address Book-----------------------");
				isExitAddressBook = true;
				System.out.println("Thank you for your time");

				break;
			default:
				System.out.println("Invalid option");
				break;

			}
		}

		scanner.close();
	}

}
