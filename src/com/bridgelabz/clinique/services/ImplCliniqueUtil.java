package com.bridgelabz.clinique.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.clinique.repository.JsonUtil;
import com.bridgelabz.clinique.model.Appointment;
import com.bridgelabz.clinique.model.AppointmentModel;
import com.bridgelabz.clinique.model.Availability;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.DoctorModel;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.model.PatientModel;

public class ImplCliniqueUtil implements ICliniqueUtil {

	// instantiation
	private static int doctorid = 0;
	private static int patientid = 1000;
	private static int appointmentid = 10000;

	private static Scanner scanner = new Scanner(System.in);

	// file paths
	private String pathDoctorJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/doctor.json";
	private String pathPatientJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/patient.json";
	private String pathAppointmentJson = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/appointment.json";

	// models
	private DoctorModel modelDoctor = new DoctorModel();
	private PatientModel modelPatient = new PatientModel();
	private AppointmentModel modelAppointment = new AppointmentModel();

	// initialization of lists of doctors patients and appointments
	private static List<Doctor> doctors = new ArrayList<>();
	private static List<Patient> patients = new ArrayList<>();
	private static List<Appointment> appointments = new ArrayList<>();

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

	/**
	 * Purpose:method for reading the details of doctor from the user
	 */
	@Override
	public Doctor getDoctor() {
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
		return doctor;
	}

	/**
	 * Purpose: method for adding doctor
	 * 
	 * @param doctor
	 */
	@Override
	public void addDoctor(Doctor doctor) {

		doctors.add(doctor);
		boolean close = false;
		while (!close) {

			System.out.println("Doctor added...");
			System.out.println("Enter 1. to add another doctor 2. close");
			if (scanner.nextInt() == 1) {
				close = false;
				doctors.add(getDoctor());
			} else {
				close = true;
				System.out.println("Please remember to save to persist records");
				System.out.println("closing...");
			}

		}

	}

	/**
	 * Purpose: method for getting details of patient from the user
	 */
	@Override
	public Patient getPatient() {
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

		return patient;
	}

	/**
	 * Purpose: method for adding patient
	 */
	@Override
	public void addPatient(Patient patient) {
		boolean close = false;
		patients.add(patient);
		while (!close) {

			System.out.println("Patient added...");
			System.out.println("Enter 1. to add another patient 2. close");
			if (scanner.nextInt() == 1) {
				close = false;
				patients.add(getPatient());
			} else {
				close = true;
				System.out.println("Please remember to save to persist records");
				System.out.println("closing...");
			}

		}
	}

	/**
	 * Purpose: method for searching doctor by id
	 */
	@Override
	public void searchDoctorById() {
		if (doctors.size() > 0) {
			System.out.println("Instruction->Doctor id starts from 1");
			System.out.println("Enter doctor id to search: ");

			var num = scanner.nextInt();
			doctors.forEach(i -> {
				if (num == i.getDrid()) {
					System.out.println(i);
				}

			});
		}

	}

	/**
	 * Purpose: method for searching doctor by name
	 */
	@Override
	public void searchDoctorByName() {
		if (doctors.size() > 0) {
			System.out.println("Enter doctor name to search: ");

			var str = scanner.next();
			doctors.forEach(i -> {
				if (str.equals(i.getDrname()))
					System.out.println(i);

			});
		}

	}

	/**
	 * Purpose: method for getting doctor name from the user
	 */
	@Override
	public String getDoctorName() {
		System.out.println("Enter doctor specialization to search: ");
		var str = scanner.next();
		return str;
	}

	/**
	 * Purpose: method for searching doctor by specialization
	 * 
	 * @return returns true if doctor with speciality is found else return false
	 */
	@Override
	public boolean searchDoctorBySpecialization(String str) {
		if (doctors.size() > 0) {
			int j = 1;
			for (int i = 0; i < doctors.size(); i++) {
				if (str.equals(doctors.get(i).getDrspecialization())) {
					System.out.println(str + " Dr->");
					showDoctorList(i, j++);
					return true;
				}
			}

		}
		return false;

	}

	/**
	 * Purpose: method for searching doctor by Availability
	 * 
	 * @param str  date
	 * @param time time
	 * 
	 * @return returns true if doctor available for date and time else return false
	 */
	@Override
	public boolean searchDoctorByAvailability(String str, int time) {
		if (doctors.size() > 0) {

			boolean isDoctorAvailable = false;
			for (int i = 0; i < doctors.size(); i++) {
				if (str.equals(doctors.get(i).getDravailability().getDate())
						&& (time >= doctors.get(i).getDravailability().getTimein()
								&& time <= doctors.get(i).getDravailability().getTimeout())) {
					System.out.println(str + " Dr->");
					showDoctorList(i, ++i);
					isDoctorAvailable = true;

				}
			}
			if (isDoctorAvailable)
				return true;
		}
		return false;

	}

	/**
	 * Purpose: method for searching patient by id
	 * 
	 * @param num patient id
	 */
	@Override
	public boolean searchPatientById(int num) {
		if (patients.size() > 0) {

			for (int i = 0; i < patients.size(); i++) {
				if (num == patients.get(i).getPtid()) {
					showPatientList(i, true);
					return true;
				}

			}
		}
		return false;

	}

	/**
	 * Purpose: method for showing patient list
	 * 
	 * @param index           index for which record is going to be print
	 * @param hasSingleRecord if single record is true the shows the details line
	 *                        else not shown
	 */
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

	/**
	 * Purpose: method for searching patient by name
	 */
	@Override
	public void searchPatientByName() {
		if (patients.size() > 0) {
			System.out.println("Enter patient name to search: ");
			var str = scanner.next();
			patients.forEach(i -> {
				if (str.equals(i.getPtname()))
					System.out.println(i);
			});
		}

	}

	/**
	 * Purpose: method for searching patient by mobile
	 */
	@Override
	public void searchPatientByMobile() {
		if (patients.size() > 0) {
			System.out.println("Enter patient mobile to search: ");
			var str = scanner.next();
			patients.forEach(i -> {
				if (str.equals(i.getPtmobile()))
					System.out.println(i);
			});
		}

	}

	/**
	 * Purpose: method for adding appointment
	 */
	@Override
	public void addAppointment() {
		if (doctors.size() < 1) {
			System.out.println("Please add doctor first!");
		} else {
			if (patients.size() < 1) {
				System.out.println("Please add patient first!");
			} else {
				validatedCriteria();
			}
		}
	}

	/**
	 * Purpose: method for validating criteria for booking appointment
	 */
	@Override
	public void validatedCriteria() {
		System.out.println("Enter doctor specialization to search: ");
		var str = scanner.next();
		boolean isDoctorFind = searchDoctorBySpecialization(str);
		if (!isDoctorFind) {
			System.out.println("No doctor found");
		} else {
			System.out.println("Enter doctor no. ");
			int index = scanner.nextInt() - 1;
			System.out.println(doctors.get(index).getDrname());
			System.out.println("Dr. available on: " + doctors.get(index).getDravailability().getDate());
			System.out.println("proceed (yes/no)");
			String yesOrNo = scanner.next().toLowerCase();
			if (yesOrNo.equals("no"))
				System.out.println("Thank you for your time");
			else if (yesOrNo.equals("yes")) {
				System.out.println("Enter time");
				int time = scanner.nextInt();
				boolean timeIsAvailable = searchDoctorByAvailability(doctors.get(index).getDravailability().getDate(),
						time);
				if (!timeIsAvailable)
					System.out.println("No time available");
				else {
					System.out.println("Time is available");
					if (doctors.get(index).getNoofpatient() > 5)
						System.out.println("Doctor exceed the limit of patient");
					else {
						System.out.println("Enter patient id: ");
						int patientId = scanner.nextInt();
						if (!searchPatientById(patientId))
							System.out.println("No patient found with this id");
						else {
							System.out.println("To book appointment press (yes/no)");
							if (scanner.next().toLowerCase().equals("yes")) {
								Appointment appointment = getAppointment(index, patientId);
								savingAppointment(appointment);
							}
						}
					}
				}
			}
		}

	}

	@Override
	public void savingAppointment(Appointment appointment) {
		appointments.add(appointment);
		modelAppointment.setAppointments(appointments);
		try {
			JsonUtil.writeMapper(pathDoctorJson, modelDoctor);
			JsonUtil.writeMapper(pathAppointmentJson, modelAppointment);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Appointment Booked...");

	}

	@Override
	public Appointment getAppointment(int index, int patientId) {
		Appointment appointment = new Appointment();
		appointmentid++;
		appointment.setAptid(appointmentid);
		appointment.setDrid(doctors.get(index).getDrid());
		appointment.setDrname(doctors.get(index).getDrname());
		appointment.setDravailability(doctors.get(index).getDravailability().getDate());
		appointment.setPtid(patientId);
		int i = getPatientIndexById(patientId);
		appointment.setPtassignname(patients.get(i).getPtname());
		appointment.setPtassignmobile(patients.get(i).getPtmobile());
		int nopt = doctors.get(index).getNoofpatient();
		nopt = nopt + 1;
		doctors.get(index).setNoofpatient(nopt);
		modelDoctor.setDoctors(doctors);

		return appointment;
	}

	@Override
	public int getPatientIndexById(int patientId) {
		for (int i = 0; i < patients.size(); i++) {
			if (patientId == patients.get(i).getPtid()) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Purpose: saving into json
	 */
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

	/**
	 * Purpose: showing all records
	 */
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

			appointments.forEach(i -> {
				System.out.println(i.getAptid() + " " + i.getDrid() + " " + i.getDrname() + " " + i.getDravailability()
						+ " " + i.getPtid() + " " + i.getPtassignname() + " " + i.getPtassignmobile());
			});
		}
	}

	/**
	 * Purpose: method for showing list for particular index
	 */
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

	/**
	 * Purpose: method for showing list for particular index
	 */
	@Override
	public void showPopularDoctor() {
		sortDoctorList();
		if (doctors.get(0).getNoofpatient() > 0) {
			System.out.println("Hospital specialization: " + doctors.get(0).getDrspecialization());
			System.out.println("Dr name is: ");
			showDoctorList(0, false);

		} else
			System.out.println("No appointments assign to doctor try again later");
	}

	/**
	 * Purpose: method for sorting doctor list on the basis of number of
	 * appointments
	 */
	@Override
	public void sortDoctorList() {
		for (int i = 0; i < doctors.size() - 1; i++) {
			for (int j = 0; j < doctors.size() - i - 1; j++) {
				if (doctors.get(j).getNoofpatient() < doctors.get(j + 1).getNoofpatient()) {
					Object temp = doctors.get(j);
					doctors.set(j, doctors.get(j + 1));
					doctors.set(j + 1, (Doctor) temp);
				}
			}
		}
	}

	/**
	 * Purpose: method for showing the list with associated numbers
	 * 
	 * @param index input from program
	 * @param num   input from program
	 */
	@Override
	public void showDoctorList(int index, int num) {

		System.out.print(doctors.get(index).getDrid() + ". " + doctors.get(index).getDrname() + "\t");
		System.out.print(doctors.get(index).getDrspecialization() + "\t");
		System.out.print(doctors.get(index).getDravailability().getDate() + "\t");
		System.out.print(doctors.get(index).getDravailability().getTimein() + "\t");
		System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");

	}

}
