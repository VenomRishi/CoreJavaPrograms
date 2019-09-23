//23

package com.bridgelabz.services;

import java.util.ArrayList;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class DoctorAppointmentUtil {

	public static void showDoctorList(ArrayList<Doctor> doctors, int index, boolean hasSigleRecord) {

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

	public static void showDoctorList(ArrayList<Doctor> doctors, int index, int num) {

		System.out.print(doctors.get(index).getDrid()+ ". " + doctors.get(index).getDrname() + "\t");
		System.out.print(doctors.get(index).getDrspecialization() + "\t");
		System.out.print(doctors.get(index).getDravailability().getDate() + "\t");
		System.out.print(doctors.get(index).getDravailability().getTimein() + "\t");
		System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");

	}

	public static void showPatientList(ArrayList<Patient> patients, int index, boolean hasSigleRecord) {
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

}
