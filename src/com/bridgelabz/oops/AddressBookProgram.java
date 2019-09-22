///******************************************************************************
// *  Purpose: Program is written for creating address book
// *
// *  @author  Rishikesh Mhatre
// *  @version 1.0
// *  @since   21-09-2019
// *
// ******************************************************************************/
//
//package com.bridgelabz.oops;
//
//import java.io.IOException;
//
//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//
//import com.bridgelabz.handler.CustomizedLinkedList;
//import com.bridgelabz.helper.JsonUtil;
//import com.bridgelabz.model.AddressBook;
//import com.bridgelabz.model.AddressBookModel;
//import com.bridgelabz.model.DL;
//import com.bridgelabz.model.GJ;
//import com.bridgelabz.model.HR;
//import com.bridgelabz.model.MH;
//import com.bridgelabz.utility.OOPsUtility;
//
//public class AddressBookProgram {
//
//	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//
//		String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/addressbook.json";
//		//String pathout = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/addressbookout.json";
//
//		/*
//		 * reading the json file
//		 */
//
//		AddressBookModel model = new AddressBookModel();
//
//		model = (AddressBookModel) JsonUtil.readMapper(path, model);
//
//
//
//		//addressBookList.addAll(model.getAddressbook());
//
//
//		/*
//		 * Address book manager
//		 * 
//		 * newAddressBook()
//		 * 
//		 * open()
//		 * 
//		 * close()
//		 * 
//		 * save()
//		 * 
//		 * saveAs()
//		 * 
//		 * quit()
//		 * 
//		 */
//
//		// instantiation
//		boolean isExitAddressBook = false;
//		while (!isExitAddressBook) {
//			System.out.println("Address book manager\n\n");
//
//			System.out.println("Select menu");
//			System.out.println("----------------------------------------------");
//
//			System.out.println("1. New Address Book\n2. Open Address Book\n" + "3. Close Address Book\n"
//					+ "4. Save Address Book\n" + "5. SaveAs Address Book\n" + "6. Quit");
//			switch (OOPsUtility.integerScanner()) {
//			case 1:
//				// new address book
//				System.out.println("Enter state in short form (eg.dd-->Dehradun");
//
//				String stateName = OOPsUtility.stringScanner();
//				// validating whether state is available or not
//				// if not available create new state
//				boolean isStateAvailable = false;
//
//				//for (int i = 0; i < addressBookList.size(); i++) {
//					//if (stateName.equals(addressBookList.get(i).getStatename())) {
//						isStateAvailable = true;
//						break;
//					}
//				}
//				//if (!isStateAvailable) {
//					// creating new state
//					//AddressBook book=new AddressBook();
//					//book.setStatename(stateName);
//					
//					//addressBookList.add(book);
//					
//					//model.setAddressbook(addressbook);
//					
//				//} else
//					System.out.println("state already available cannot create new state");
//
//				//break;
//			//case 2:
//				// open
//
////				System.out.println("Enter state");
////
////				break;
////			case 3:
////				// close
////				break;
////			case 4:
////				// save
////				break;
////			case 5:
////				// saveAs
////				break;
////			case 6:
////				// quit
////				isExitAddressBook = true;
////				System.out.println("Thank you for your time");
////				break;
////			default:
////				System.out.println("Invalid option");
////				break;
////			}
////
////			System.out.println("----------------------------------------------");
////		}
//
//		/*
//		 * writing the json file
//		 */
//
//		System.out.println("Hello World");
//
//	}
//
//}
