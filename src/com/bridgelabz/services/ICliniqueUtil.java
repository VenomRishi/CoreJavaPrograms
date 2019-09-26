package com.bridgelabz.services;

public interface ICliniqueUtil {

	public void readJson();

	public void addDoctor();

	public void addPatient();

	public void searchDoctorById();

	public void searchDoctorByName();

	public void searchDoctorBySpecialization();

	public void searchDoctorByAvailability();

	public void searchPatientById();

	public void searchPatientByName();

	public void searchPatientByMobile();

	public void addAppointment();

	public void save();

	public void showAllRecords();
	
	public void showPopularDoctor();

	void showDoctorList(int index, boolean hasSigleRecord);

	void showPatientList(int index, boolean hasSingleRecord);
}
