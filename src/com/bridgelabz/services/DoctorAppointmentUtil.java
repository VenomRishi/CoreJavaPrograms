//23

package com.bridgelabz.services;

import java.util.ArrayList;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class DoctorAppointmentUtil {

	public static void showDoctorList(ArrayList<Doctor> doctors, int index, boolean hasSigleRecord) {

		if (hasSigleRecord) {
			System.out.print("Dr name\t");
			System.out.print("Dr specialization\t");
			System.out.print("Dr Availability Date\t");
			System.out.print("Dr Availability Time in\t");
			System.out.println("Dr Availability Time out\t");
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
	
	public static void showDoctorList(ArrayList<Doctor> doctors, int index, int num) {

		
			System.out.print(num+". "+doctors.get(index).getDrname() + "\t");
			System.out.print(doctors.get(index).getDrspecialization() + "\t");
			System.out.print(doctors.get(index).getDravailability().getDate() + "\t");
			System.out.print(doctors.get(index).getDravailability().getTimein() + "\t");
			System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");

	}

	public static void showPatientList(ArrayList<Patient> patients, int index, boolean hasSigleRecord) {
		if (hasSigleRecord) {
			System.out.print("Patient name\t");
			System.out.print("Patient age\t");
			System.out.print("Patient mobile\t");
			System.out.println(patients.get(index).getPtname() + "\t");
			System.out.println(patients.get(index).getPtage() + "\t");
			System.out.println(patients.get(index).getPtmobile() + "\t");
		} else {
			System.out.println(patients.get(index).getPtname() + "\t");
			System.out.println(patients.get(index).getPtage() + "\t");
			System.out.println(patients.get(index).getPtmobile() + "\t");
		}
	}

}
