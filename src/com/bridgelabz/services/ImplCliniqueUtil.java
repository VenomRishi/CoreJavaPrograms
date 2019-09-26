package com.bridgelabz.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.AppointmentModel;
import com.bridgelabz.model.Availability;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorModel;
import com.bridgelabz.model.Patient;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.repository.JsonUtil;

public class ImplCliniqueUtil implements ICliniqueUtil {

	// instantiation
	static int doctorid = 0;
	static int patientid = 1000;
	static int appointmentid = 10000;

	static Scanner scanner = new Scanner(System.in);

	// file paths
	String pathDoctorJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/doctor.json";
	String pathPatientJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/patient.json";
	String pathAppointmentJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/appointment.json";

	// models
	DoctorModel modelDoctor = new DoctorModel();
	PatientModel modelPatient = new PatientModel();
	AppointmentModel modelAppointment = new AppointmentModel();

	// initialization of lists of doctors patients and appointments
	static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	static ArrayList<Patient> patients = new ArrayList<Patient>();
	static ArrayList<Appointment> appointments = new ArrayList<Appointment>();

	/**
	 * Purpose: reading all the json files
	 */
	@Override
	public void readJson() {

		// checking whether path file is exits or not if exist then add data into lists
		File fileDoctor = new File(pathDoctorJson);
		File filePatient = new File(pathPatientJson);
		File fileAppointment = new File(pathAppointmentJson);
		// checking whether doctor file is empty or not
		if (fileDoctor.exists() && fileDoctor.length() > 0) {
			try {
				modelDoctor = (DoctorModel) JsonUtil.readMapper(pathDoctorJson, modelDoctor);
			} catch (IOException e) {
				e.printStackTrace();
			}
			doctors.addAll(modelDoctor.getDoctors());
			doctorid = doctors.get(doctors.size() - 1).getDrid();
		}

		// checking whether patient file is empty or not
		if (filePatient.exists() && filePatient.length() > 0) {
			try {
				modelPatient = (PatientModel) JsonUtil.readMapper(pathPatientJson, modelPatient);
			} catch (IOException e) {
				e.printStackTrace();
			}
			patients.addAll(modelPatient.getPatients());
			patientid = patients.get(patients.size() - 1).getPtid();
		}

		// checking whether appointment file is empty or not
		if (fileAppointment.exists() && fileAppointment.length() > 0) {
			try {
				modelAppointment = (AppointmentModel) JsonUtil.readMapper(pathAppointmentJson, modelAppointment);
			} catch (IOException e) {
				e.printStackTrace();
			}
			appointments.addAll(modelAppointment.getAppointments());
			appointmentid = appointments.get(appointments.size() - 1).getAptid();
		}

	}

	@Override
	public void addDoctor() {
		System.out.println("->adding doctor<-");
		Doctor doctor = new Doctor();
		doctorid++;
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

		doctors.add(doctor);
		boolean close = false;
		while (!close) {

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

	}

	@Override
	public void addPatient() {
		boolean close = false;
		while (!close) {
			System.out.println("->adding patient<-");
			Patient patient = new Patient();
			patientid++;
			patient.setPtid(patientid);
			System.out.println("Enter patient name: ");
			patient.setPtname(scanner.next());
			System.out.println("Enter patient age: ");
			patient.setPtage(scanner.nextInt());
			System.out.println("Enter patient mobile: ");
			patient.setPtmobile(scanner.next());

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
	}

	@Override
	public void searchDoctorById() {
		if (doctors.size() > 0) {
			System.out.println("Instruction->Doctor id starts from 1");
			System.out.println("Enter doctor id to search: ");
			var isFound = false;
			var index = 0;
			var num = scanner.nextInt();
			for (int i = 0; i < doctors.size(); i++) {
				if (num == doctors.get(i).getDrid()) {
					isFound = true;
					index = i;
					break;
				}
			}
			if (isFound) {
				showDoctorList(index, true);
			} else
				System.out.println("No record found associated with this id");
		} else
			System.out.println("No records to search");

	}

	@Override
	public void searchDoctorByName() {
		if (doctors.size() > 0) {
			System.out.println("Enter doctor name to search: ");
			var isFound = false;
			var str = scanner.next();
			var index = 0;
			for (int i = 0; i < doctors.size(); i++) {

				if (str.equals(doctors.get(i).getDrname().substring(4, doctors.get(i).getDrname().length()))) {
					isFound = true;
					index = i;
					break;
				}
			}
			if (isFound) {
				showDoctorList(index, true);
			} else
				System.out.println("No record found associated with this name");
		} else
			System.out.println("No records to search");

	}

	@Override
	public void searchDoctorBySpecialization() {
		if (doctors.size() > 0) {
			System.out.println("Enter doctor specialization to search: ");
			var isFound = false;
			var str = scanner.next();
			var index = 0;
			for (int i = 0; i < doctors.size(); i++) {
				if (str.equals(doctors.get(i).getDrspecialization())) {
					isFound = true;
					index = i;
					break;
				}
			}
			if (isFound) {
				showDoctorList(index, true);
			} else
				System.out.println("No record found associated with this specialization");
		} else
			System.out.println("No records to search");

	}

	@Override
	public void searchDoctorByAvailability() {
		if (doctors.size() > 0) {
			System.out.println("Enter doctor date: ");
			var str = scanner.next();
			System.out.println("Enter time from");
			int time = scanner.nextInt();

			var isFound = false;
			boolean isFirst = true;
			var index = 0;
			for (int i = 0; i < doctors.size(); i++) {
				if (str.equals(doctors.get(i).getDravailability().getDate())
						&& (time >= doctors.get(i).getDravailability().getTimein()
								&& time <= doctors.get(i).getDravailability().getTimeout())) {

					isFound = true;
					index = i;

				}
				if (isFound) {
					showDoctorList(index, isFirst);
					isFirst = false;
					isFound = false;
				}
			}
			if (!isFirst) {
				System.out.println("No record found associated with this specialization");
			}
		} else
			System.out.println("No records to search");

	}

	@Override
	public void searchPatientById() {
		if (patients.size() > 0) {
			System.out.println("Instruction->Patient id starts from 1000 range");
			System.out.println("Enter patient id to search: ");
			var isFound = false;
			var num = scanner.nextInt();
			var index = 0;
			for (int i = 0; i < patients.size(); i++) {
				if (num == patients.get(i).getPtid()) {
					isFound = true;
					index = i;
					break;
				}
			}
			if (isFound) {
				showPatientList(index, true);
			} else
				System.out.println("No record found associated with this id");
		} else
			System.out.println("No records to search");

	}

	@Override
	public void showPatientList(int index, boolean hasSigleRecord) {
		if (hasSigleRecord) {
			System.out.print("Patient Details\t\n");
			System.out.print(patients.get(index).getPtid() + "\t");
			System.out.print(patients.get(index).getPtname() + "\t");
			System.out.print(patients.get(index).getPtage() + "\t");
			System.out.println(patients.get(index).getPtmobile() + "\t");
		} else {
			System.out.print(patients.get(index).getPtid() + "\t");
			System.out.print(patients.get(index).getPtname() + "\t");
			System.out.print(patients.get(index).getPtage() + "\t");
			System.out.println(patients.get(index).getPtmobile() + "\t");
		}
	}

	@Override
	public void searchPatientByName() {
		if (patients.size() > 0) {
			System.out.println("Enter patient name to search: ");
			var isFound = false;
			var str = scanner.next();
			var index = 0;
			for (int i = 0; i < patients.size(); i++) {
				if (str.equals(patients.get(i).getPtname())) {
					isFound = true;
					index = i;
					break;
				}
			}
			if (isFound) {
				showPatientList(index, true);
			} else
				System.out.println("No record found associated with this name");
		} else
			System.out.println("No records to search");

	}

	@Override
	public void searchPatientByMobile() {
		if (patients.size() > 0) {
			System.out.println("Enter patient mobile to search: ");
			var isFound = false;
			var str = scanner.next();
			var index = 0;
			for (int i = 0; i < patients.size(); i++) {
				if (str.equals(patients.get(i).getPtmobile())) {
					isFound = true;
					index = i;
					break;
				}
			}
			if (isFound) {
				showPatientList(index, true);
			} else
				System.out.println("No record found associated with this id");
		} else
			System.out.println("No records to search");

	}

	@Override
	public void addAppointment() {
		if (doctors.size() > 0) {
			var isFound = false;
			boolean isFirst = false;
			System.out.println("Enter specialized doctor to treat from: ");
			var str = scanner.next();
			int index = 0;
			System.out.println("Searching doctors...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int j = 1;
			for (int i = 0; i < doctors.size(); i++) {
				if (str.equals(doctors.get(i).getDrspecialization())) {
					isFound = true;
					index = i;

				}
				if (isFound) {
					System.out.println(str + " Dr->");
					showDoctorList(index, j++);
					isFirst = true;
					isFound = false;
				}
			}
			if (!isFirst) {
				System.out.println("No doctor found");
			} else {
				System.out.println("Enter doctor no. ");
				index = scanner.nextInt() - 1;

				System.out.println(doctors.get(index).getDrname());

				System.out.println("Enter timing");

				System.out.println("Dr. available on: " + doctors.get(index).getDravailability().getDate());
				System.out.println("proceed (yes/no)");
				if (scanner.next().toLowerCase().equals("yes")) {
					System.out.println("Enter time");
					int time = scanner.nextInt();
					boolean timeIsAvailable = false;

					if ((time >= doctors.get(index).getDravailability().getTimein()
							&& time <= doctors.get(index).getDravailability().getTimeout())) {
						timeIsAvailable = true;
					}
					if (timeIsAvailable) {
						System.out.println("Time is available");
						// check appointmetn of doctor not exceed 5 pati`ent at a time
						if (doctors.get(index).getNoofpatient() < 5) {
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
											appointmentid++;
											appointment.setAptid(appointmentid);
											appointment.setDrid(doctors.get(index).getDrid());
											appointment.setDrname(doctors.get(index).getDrname());
											appointment.setDravailability(
													doctors.get(index).getDravailability().getDate());
											appointment.setPtid(id);
											appointment.setPtassignname(patients.get(i).getPtname());
											appointment.setPtassignmobile(patients.get(i).getPtmobile());
											int nopt = doctors.get(index).getNoofpatient();
											nopt = nopt + 1;
											doctors.get(index).setNoofpatient(nopt);

											modelDoctor.setDoctors(doctors);

											appointments.add(appointment);

											// modelAppointment.setAppointments(appointments);
											modelAppointment.setAppointments(appointments);
											try {
												JsonUtil.writeMapper(pathDoctorJson, modelDoctor);
												JsonUtil.writeMapper(pathAppointmentJson, modelAppointment);
											} catch (IOException e) {
												e.printStackTrace();
											}
											System.out.println("Appointment Booked...");

											break;

										}
									}
								}
							}
						} else
							System.out.println("Doctor appointment is full..");

					} else
						System.out.println("Cannot able to book doctor because of timing");
				}

			}

		} else
			System.out.println("No records to book appointment");

	}

	@Override
	public void save() {
		if (doctors.size() > 0) {
			modelDoctor.setDoctors(doctors);
			try {
				JsonUtil.writeMapper(pathDoctorJson, modelDoctor);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// saving patient
		if (patients.size() > 0) {
			modelPatient.setPatients(patients);
			try {
				JsonUtil.writeMapper(pathPatientJson, modelPatient);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// saving appointment
		if (appointments.size() > 0) {
			modelAppointment.setAppointments(appointments);
			try {
				JsonUtil.writeMapper(pathAppointmentJson, modelAppointment);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Saving...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showAllRecords() {
		if (doctors.size() > 0) {
			System.out.println("NoOfPatient\tDoctor record");
			for (int i = 0; i < doctors.size(); i++) {
				System.out.print(doctors.get(i).getNoofpatient() + "\t\t");
				System.out.print(doctors.get(i).getDrid() + "\t");
				showDoctorList(i, false);
			}
		}
		if (patients.size() > 0) {
			System.out.println("Patient records");
			for (int i = 0; i < patients.size(); i++) {
				showPatientList(i, false);
			}
		}

		if (appointments.size() > 0) {
			System.out.println("Appointment records");
//			for (int i = 0; i < appointments.size(); i++) {
//				System.out.print(appointments.get(i).getAptid() + "\t");
//				System.out.print(appointments.get(i).getDrid() + "\t");
//				System.out.print(appointments.get(i).getDrname() + "\t");
//				System.out.print(appointments.get(i).getDravailability() + "\t");
//				System.out.print(appointments.get(i).getPtid() + "\t");
//				System.out.print(appointments.get(i).getPtassignname() + "\t");
//				System.out.println(appointments.get(i).getPtassignmobile());
//			}
			appointments.forEach(i -> {
				System.out.println(i.getAptid() + " " + i.getDrid() + " " + i.getDrname() + " " + i.getDravailability()
						+ " " + i.getPtid() + " " + i.getPtassignname() + " " + i.getPtassignmobile());
			});
		}
	}

	@Override
	public void showDoctorList(int index, boolean hasSigleRecord) {
		if (hasSigleRecord) {
			System.out.println("Dr details");
			System.out.print(doctors.get(index).getDrname() + "\t");
			System.out.print(doctors.get(index).getDrspecialization() + "\t");
			System.out.print(doctors.get(index).getDravailability().getDate() + "\t");
			System.out.print(doctors.get(index).getDravailability().getTimein() + "\t");
			System.out.print(doctors.get(index).getDravailability().getTimeout() + "\t");
		} else {
			System.out.print(doctors.get(index).getDrname() + "\t");
			System.out.print(doctors.get(index).getDrspecialization() + "\t");
			System.out.print(doctors.get(index).getDravailability().getDate() + "\t");
			System.out.print(doctors.get(index).getDravailability().getTimein() + "\t");
			System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");
		}

	}

	@Override
	public void showPopularDoctor() {
		for (int i = 0; i < doctors.size() - 1; i++) {
			for (int j = 0; j < doctors.size() - i - 1; j++) {
				if (doctors.get(j).getNoofpatient() < doctors.get(j + 1).getNoofpatient()) {
					Object temp = doctors.get(j);
					doctors.set(j, doctors.get(j + 1));
					doctors.set(j + 1, (Doctor) temp);
				}
			}
		}
		if (doctors.get(0).getNoofpatient() > 0) {
			System.out.println("Hospital specialization: " + doctors.get(0).getDrspecialization());
			System.out.println("Dr name is: ");
			showDoctorList(0, false);

		} else
			System.out.println("No appointments assign to doctor try again later");
	}

	public static void showDoctorList(int index, int num) {

		System.out.print(doctors.get(index).getDrid() + ". " + doctors.get(index).getDrname() + "\t");
		System.out.print(doctors.get(index).getDrspecialization() + "\t");
		System.out.print(doctors.get(index).getDravailability().getDate() + "\t");
		System.out.print(doctors.get(index).getDravailability().getTimein() + "\t");
		System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");

	}

}
