/******************************************************************************
 *  Purpose: Program is written for doctor appointment system
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   23-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.AppointmentModel;
import com.bridgelabz.model.Availability;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorModel;
import com.bridgelabz.model.Patient;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.repository.JsonUtil;
import com.bridgelabz.services.DoctorAppointmentUtil;

public class DoctorAppointment {

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

		String pathDoctorJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/doctor.json";
		String pathPatientJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/patient.json";
		String pathAppointmentJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/appointment.json";

		// instantiation
		int doctorid = 0;
		int patientid = 1000;
		int appointmentid = 10000;

		// models
		DoctorModel modelDoctor = new DoctorModel();
		PatientModel modelPatient = new PatientModel();
		AppointmentModel modelAppointment = new AppointmentModel();

		// initialization of lists of doctors patients and appointments
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();

		// checking whether path file is exits or not if exist then add data into lists
		File fileDoctor = new File(pathDoctorJson);
		File filePatient = new File(pathPatientJson);
		File fileAppointment = new File(pathAppointmentJson);

		// checking whether doctor file is empty or not
		if (fileDoctor.exists() && fileDoctor.length() > 0) {
			modelDoctor = (DoctorModel) JsonUtil.readMapper(pathDoctorJson, modelDoctor);
			doctors.addAll(modelDoctor.getDoctors());
			doctorid = doctors.get(doctors.size() - 1).getDrid();
		}

		// checking whether patient file is empty or not
		if (filePatient.exists() && filePatient.length() > 0) {
			modelPatient = (PatientModel) JsonUtil.readMapper(pathPatientJson, modelPatient);
			patients.addAll(modelPatient.getPatients());
			patientid = patients.get(patients.size() - 1).getPtid();
		}

		// checking whether appointment file is empty or not
		if (fileAppointment.exists() && fileAppointment.length() > 0) {
			modelAppointment = (AppointmentModel) JsonUtil.readMapper(pathAppointmentJson, modelAppointment);
			appointments.addAll(modelAppointment.getAppointments());
			appointmentid = appointments.get(appointments.size() - 1).getAptid();
		}

		// creating menu list

		boolean exit = false;
		boolean close = false;
		Scanner scanner = new Scanner(System.in);
		boolean isFound;
		int num;
		String str;
		int index = 0;

		while (!exit) {
			System.out.println("Select option from menu\n");

			System.out.println(
					"1. add doctor\n2. add patient\n3. search doctor by id\n4. search doctor by name\n5. search doctor by specialization\n6. search doctor by availability\n7. search patient by id\n8. search patient by name\n9. search patient by number\n10. add appointment\n11. save\n12. exit");
			switch (scanner.nextInt()) {
			case 1:
				// add doctor
				System.out.println();
				System.out.println("-------------------------add doctor-----------------------");
				System.out.println();

				close = false;
				while (!close) {

					System.out.println("->adding doctor<-");
					Doctor doctor = new Doctor();
					doctor.setDrid(doctorid);
					System.out.println("Enter doctor name: ");
					doctor.setDrname("Dr. " + scanner.next());
					System.out.println("Enter doctor specialization: ");
					doctor.setDrspecialization(scanner.next());
					System.out.println("->availability<-");
					Availability availability = new Availability();
					System.out.println("Time format is of 24 hr");
					System.out.println("Date format is dd/MM/yyyy");
					System.out.println();
					System.out.println("Enter doctor time in: ");
					availability.setTimein(scanner.nextInt());
					System.out.println("Enter doctor time out: ");
					availability.setTimeout(scanner.nextInt());
					System.out.println("Enter doctor date");
					availability.setDate(scanner.next());
					doctor.setDravailability(availability);
					doctor.setNoofpatient(0);
					doctorid++;
					doctors.add(doctor);

					System.out.println("Doctor added...");
					System.out.println("Enter 1. to add another doctor 2. close");
					if (scanner.nextInt() == 1) {
						close = false;
					} else {
						close = true;
						System.out.println("Please remember to save to persist records");
						System.out.println("closing...");
					}

				}

				System.out.println("-------------------------add doctor-----------------------");
				System.out.println();
				break;
			case 2:
				// add patient
				System.out.println();
				System.out.println("-------------------------add patient-----------------------");
				System.out.println();

				close = false;
				while (!close) {
					System.out.println("->adding patient<-");
					Patient patient = new Patient();
					patient.setPtid(patientid);
					System.out.println("Enter patient name: ");
					patient.setPtname(scanner.next());
					System.out.println("Enter patient age: ");
					patient.setPtage(scanner.nextInt());
					System.out.println("Enter patient mobile: ");
					patient.setPtmobile(scanner.next());
					patientid++;
					patients.add(patient);

					System.out.println("Patient added...");
					System.out.println("Enter 1. to add another patient 2. close");
					if (scanner.nextInt() == 1) {
						close = false;
					} else {
						close = true;
						System.out.println("Please remember to save to persist records");
						System.out.println("closing...");
					}

				}

				System.out.println("-------------------------add patient-----------------------");
				System.out.println();
				break;
			case 3:
				// search doctor by id
				System.out.println();
				System.out.println("-------------------------search doctor by id-----------------------");
				System.out.println();

				if (doctors.size() > 0) {
					System.out.println("Instruction->Doctor id starts from 1");
					System.out.println("Enter doctor id to search: ");
					isFound = false;
					num = scanner.nextInt();
					for (int i = 0; i < doctors.size(); i++) {
						if (num == doctors.get(i).getDrid()) {
							isFound = true;
							index = i;
							break;
						}
					}
					if (isFound) {
						DoctorAppointmentUtil.showDoctorList(doctors, index, true);
					} else
						System.out.println("No record found associated with this id");
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search doctor by id-----------------------");
				System.out.println();
				break;
			case 4:
				// search doctor by name
				System.out.println();
				System.out.println("-------------------------search doctor by name-----------------------");
				System.out.println();

				if (doctors.size() > 0) {
					System.out.println("Enter doctor name to search: ");
					isFound = false;
					str = scanner.next();
					for (int i = 0; i < doctors.size(); i++) {
						if (str.equals(doctors.get(i).getDrname())) {
							isFound = true;
							index = i;
							break;
						}
					}
					if (isFound) {
						DoctorAppointmentUtil.showDoctorList(doctors, index, true);
					} else
						System.out.println("No record found associated with this name");
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search doctor by name-----------------------");
				System.out.println();
				break;
			case 5:
				// search doctor by specialization
				System.out.println();
				System.out.println("-------------------------search doctor by specialization-----------------------");
				System.out.println();

				if (doctors.size() > 0) {
					System.out.println("Enter doctor specialization to search: ");
					isFound = false;
					str = scanner.next();
					for (int i = 0; i < doctors.size(); i++) {
						if (str.equals(doctors.get(i).getDrspecialization())) {
							isFound = true;
							index = i;
							break;
						}
					}
					if (isFound) {
						DoctorAppointmentUtil.showDoctorList(doctors, index, true);
					} else
						System.out.println("No record found associated with this specialization");
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search doctor by specialization-----------------------");
				System.out.println();
				break;
			case 6:
				// search doctor by availability
				System.out.println();
				System.out.println("-------------------------search doctor by availability-----------------------");
				System.out.println();

				if (doctors.size() > 0) {
					System.out.println("Enter doctor date: ");
					str = scanner.next();
					System.out.println("Enter time from");
					int timefrom = scanner.nextInt();
					System.out.println("Enter time to");
					int timeto = scanner.nextInt();
					isFound = false;
					boolean isFirst = true;
					for (int i = 0; i < doctors.size(); i++) {
						if (str.equals(doctors.get(i).getDravailability().getDate())
								&& (timefrom >= doctors.get(i).getDravailability().getTimein()
										&& timeto <= doctors.get(i).getDravailability().getTimeout())) {

							isFound = true;
							index = i;

						}
						if (isFound) {
							DoctorAppointmentUtil.showDoctorList(doctors, index, isFirst);
							isFirst = false;
							isFound = false;
						}
					}
					if (!isFirst) {
						System.out.println("No record found associated with this specialization");
					}
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search doctor by availability-----------------------");
				System.out.println();
				break;
			case 7:
				// search patient by id
				System.out.println();
				System.out.println("-------------------------search patient by id-----------------------");
				System.out.println();

				if (patients.size() > 0) {
					System.out.println("Instruction->Patient id starts from 1000 range");
					System.out.println("Enter patient id to search: ");
					isFound = false;
					num = scanner.nextInt();
					for (int i = 0; i < patients.size(); i++) {
						if (num == patients.get(i).getPtid()) {
							isFound = true;
							index = i;
							break;
						}
					}
					if (isFound) {
						DoctorAppointmentUtil.showPatientList(patients, index, true);
					} else
						System.out.println("No record found associated with this id");
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search patient by id-----------------------");
				System.out.println();
				break;
			case 8:
				// search patient by name
				System.out.println();
				System.out.println("-------------------------search patient by name-----------------------");
				System.out.println();

				if (patients.size() > 0) {
					System.out.println("Enter patient name to search: ");
					isFound = false;
					str = scanner.next();
					for (int i = 0; i < patients.size(); i++) {
						if (str.equals(patients.get(i).getPtname())) {
							isFound = true;
							index = i;
							break;
						}
					}
					if (isFound) {
						DoctorAppointmentUtil.showPatientList(patients, index, true);
					} else
						System.out.println("No record found associated with this name");
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search patient by name-----------------------");
				System.out.println();
				break;
			case 9:
				// search patient by mobile
				System.out.println("-------------------------search patient by mobile-----------------------");
				System.out.println();

				if (patients.size() > 0) {
					System.out.println("Enter patient mobile to search: ");
					isFound = false;
					str = scanner.next();
					for (int i = 0; i < patients.size(); i++) {
						if (str.equals(patients.get(i).getPtmobile())) {
							isFound = true;
							index = i;
							break;
						}
					}
					if (isFound) {
						DoctorAppointmentUtil.showPatientList(patients, index, true);
					} else
						System.out.println("No record found associated with this id");
				} else
					System.out.println("No records to search");

				System.out.println("-------------------------search patient by mobile-----------------------");
				System.out.println();
				break;
			case 10:
				// add appointment
				System.out.println();
				System.out.println("-------------------------add appointment-----------------------");
				System.out.println();

				if (doctors.size() > 0) {
					isFound = false;
					boolean isFirst = true;
					System.out.println("Enter specialized doctor to treat from: ");
					str = scanner.next();
					System.out.println("Searching doctors...");
					Thread.sleep(2000);
					int j = 1;
					for (int i = 0; i < doctors.size(); i++) {
						if (str.equals(doctors.get(i).getDrspecialization())) {
							isFound = true;
							// index = i;

						}
						if (isFound) {
							DoctorAppointmentUtil.showDoctorList(doctors, index, j++);
							isFirst = false;
							isFound = false;
						}
					}
					if (isFirst) {
						System.out.println("No doctor found");
					} else {
						System.out.println("Enter doctor no. ");
						index = scanner.nextInt();
						System.out.println("Enter timing");

						System.out.println("Time format is of 24 hr");
						System.out.println("Date format is dd/MM/yyyy");

						System.out.println("Enter date: ");
						String date = scanner.next();
						System.out.println("Enter time");
						int time = scanner.nextInt();
						boolean timeIsAvailable = false;

						if (date.equals(doctors.get(index).getDravailability().getDate())
								&& (time >= doctors.get(index).getDravailability().getTimein()
										&& time <= doctors.get(index).getDravailability().getTimeout()
										&& doctors.get(index).getNoofpatient() < 6)) {
							timeIsAvailable = true;
						}

						if (timeIsAvailable) {
							System.out.println("Time is available");
							boolean patientexit = false;
							int id;
							while (!patientexit) {
								System.out.println("Enter patient id: ");
								id = scanner.nextInt();
								for (int i = 0; i < patients.size(); i++) {
									if (patients.get(i).getPtid() == id) {
										patientexit = true;
										System.out.println("To book appointment press (y/n)");
										if (scanner.next().charAt(0) == 'y') {
											Appointment appointment = new Appointment();
											appointment.setAptid(appointmentid++);
											appointment.setDrid(doctors.get(index).getDrid());
											appointment.setDrname(doctors.get(index).getDrname());
											appointment.setDravailability(date + " " + time);
											appointment.setPtid(id);
											appointment.setPtassignname(patients.get(i).getPtname());
											appointment.setPtassignmobile(patients.get(i).getPtmobile());

											doctors.get(index).setNoofpatient(doctors.get(index).getNoofpatient() + 1);

											appointments.add(appointment);

											System.out.println("Appointment Booked...");
											break;

										}
									}
								}
							}

						} else
							System.out.println("Cannot able to book doctor because of timing or no of patient books");

					}

				} else
					System.out.println("No records to book appointment");

				System.out.println("-------------------------add appointment-----------------------");
				System.out.println();
				break;
			case 11:
				// save all objects into json
				System.out.println("-------------------------save-----------------------");
				System.out.println();
				// saving doctor
				if (doctors.size() > 0) {
					modelDoctor.setDoctors(doctors);
					JsonUtil.writeMapper(pathDoctorJson, modelDoctor);
				}

				// saving patient
				if (patients.size() > 0) {
					modelPatient.setPatients(patients);
					JsonUtil.writeMapper(pathPatientJson, modelPatient);
				}

				// saving appointment
				if (appointments.size() > 0) {
					modelAppointment.setAppointments(appointments);
					JsonUtil.writeMapper(pathAppointmentJson, modelAppointment);
				}
				System.out.println("Saving...");
				Thread.sleep(2000);

				System.out.println("-------------------------save-----------------------");
				System.out.println();

			case 12:
				// search patient by id
				exit = true;
				System.out.println("Thank you for your time...");
				Thread.sleep(2000);
				break;
			}
		}

		scanner.close();

	}

}
