/******************************************************************************
 *  Purpose: Program is written for doctor appointment system
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   23-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.controller;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.services.ImplCliniqueUtil;

public class Clinique {

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, IOException, InterruptedException {

		/**
		 * Operation for doctor appointments
		 * 
		 * add doctor
		 * 
		 * add patient
		 * 
		 * search doctor by id
		 * 
		 * search doctor by name
		 * 
		 * search doctor by specialization
		 * 
		 * search doctor by availability
		 * 
		 * search patient by id
		 * 
		 * search patient by name
		 * 
		 * search patient by mobile
		 * 
		 */

		ImplCliniqueUtil util = new ImplCliniqueUtil();

		// reading json

		util.readJson();

		// creating menu list

		boolean exit = false;

		Scanner scanner = new Scanner(System.in);

		while (!exit) {
			System.out.println("\nSelect option from menu\n");

			System.out.println(
					"1. add doctor\n2. add patient\n3. search doctor by id\n4. search doctor by name\n5. search doctor by specialization\n6. search doctor by availability\n7. search patient by id\n8. search patient by name\n9. search patient by number\n10. add appointment\n11. save\n12. exit\n13. show records\n14. see popular doctor");
			switch (scanner.nextInt()) {
			case 1:
				// add doctor
				System.out.println();
				System.out.println("-------------------------add doctor-----------------------");
				System.out.println();

				util.addDoctor();

				System.out.println();
				System.out.println("-------------------------add doctor-----------------------");
				System.out.println();
				break;
			case 2:
				// add patient
				System.out.println();
				System.out.println("-------------------------add patient-----------------------");
				System.out.println();

				util.addPatient();

				System.out.println();
				System.out.println("-------------------------add patient-----------------------");
				System.out.println();
				break;
			case 3:
				// search doctor by id
				System.out.println();
				System.out.println("-------------------------search doctor by id-----------------------");
				System.out.println();

				util.searchDoctorById();

				System.out.println();
				System.out.println("-------------------------search doctor by id-----------------------");
				System.out.println();
				break;
			case 4:
				// search doctor by name
				System.out.println();
				System.out.println("-------------------------search doctor by name-----------------------");
				System.out.println();

				util.searchDoctorByName();

				System.out.println();
				System.out.println("-------------------------search doctor by name-----------------------");
				System.out.println();
				break;
			case 5:
				// search doctor by specialization
				System.out.println();
				System.out.println("-------------------------search doctor by specialization-----------------------");
				System.out.println();

				util.searchDoctorBySpecialization();

				System.out.println();
				System.out.println("-------------------------search doctor by specialization-----------------------");
				System.out.println();
				break;
			case 6:
				// search doctor by availability
				System.out.println();
				System.out.println("-------------------------search doctor by availability-----------------------");
				System.out.println();

				util.searchDoctorByAvailability();

				System.out.println();
				System.out.println("-------------------------search doctor by availability-----------------------");
				System.out.println();
				break;
			case 7:
				// search patient by id
				System.out.println();
				System.out.println("-------------------------search patient by id-----------------------");
				System.out.println();

				util.searchPatientById();

				System.out.println();
				System.out.println("-------------------------search patient by id-----------------------");
				System.out.println();
				break;
			case 8:
				// search patient by name
				System.out.println();
				System.out.println("-------------------------search patient by name-----------------------");
				System.out.println();

				util.searchPatientByName();

				System.out.println();
				System.out.println("-------------------------search patient by name-----------------------");
				System.out.println();
				break;
			case 9:
				// search patient by mobile
				System.out.println("-------------------------search patient by mobile-----------------------");
				System.out.println();

				util.searchPatientByMobile();

				System.out.println();
				System.out.println("-------------------------search patient by mobile-----------------------");
				System.out.println();
				break;
			case 10:
				// add appointment
				System.out.println();
				System.out.println("-------------------------add appointment-----------------------");
				System.out.println();

				util.addAppointment();

				System.out.println();
				System.out.println("-------------------------add appointment-----------------------");
				System.out.println();
				break;
			case 11:
				// save all objects into json
				System.out.println("-------------------------save-----------------------");
				System.out.println();
				// saving doctor

				util.save();

				System.out.println();
				System.out.println("-------------------------save-----------------------");
				System.out.println();
				break;

			case 12:
				// search patient by id
				exit = true;
				System.out.println("Thank you for your time...");
				Thread.sleep(2000);
				break;

			case 13:
				// show records
				util.showAllRecords();
				break;
			case 14:
				util.showPopularDoctor();
				break;
			default:
				System.out.println("Please select valid option");
			}
		}

		scanner.close();

	}

}
