//23

package com.bridgelabz.services;

import java.util.ArrayList;

import com.bridgelabz.model.Doctor;

public class DoctorAppointmentUtil {

	public static void showDoctorList(ArrayList<Doctor> doctors, int index, boolean hasSigleRecord) {

		if (hasSigleRecord) {
			System.out.print("Dr name\t");
			System.out.print("Dr specialization\t");
			System.out.print("Dr Availability Date\t");
			System.out.print("Dr Availability Time in\t");
			System.out.println("Dr Availability Time out\t");
			System.out.println(doctors.get(index).getDrname() + "\t");
			System.out.println(doctors.get(index).getDrspecialization() + "\t");
			System.out.println(doctors.get(index).getDravailability().getDate() + "\t");
			System.out.println(doctors.get(index).getDravailability().getTimein() + "\t");
			System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");
		} else {
			System.out.println(doctors.get(index).getDrname() + "\t");
			System.out.println(doctors.get(index).getDrspecialization() + "\t");
			System.out.println(doctors.get(index).getDravailability().getDate() + "\t");
			System.out.println(doctors.get(index).getDravailability().getTimein() + "\t");
			System.out.println(doctors.get(index).getDravailability().getTimeout() + "\t");
		}

	}

}
