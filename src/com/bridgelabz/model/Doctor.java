package com.bridgelabz.model;

public class Doctor {

	private int drid;
	private String drname;
	private String drspecialization;
	private Availability dravailability;
	private int noofpatient;

	public int getDrid() {
		return drid;
	}

	public void setDrid(int drid) {
		this.drid = drid;
	}

	public String getDrname() {
		return drname;
	}

	public void setDrname(String drname) {
		this.drname = drname;
	}

	public String getDrspecialization() {
		return drspecialization;
	}

	public void setDrspecialization(String drspecialization) {
		this.drspecialization = drspecialization;
	}

	public int getNoofpatient() {
		return noofpatient;
	}

	public void setNoofpatient(int noofpatient) {
		this.noofpatient = noofpatient;
	}

	public Availability getDravailability() {
		return dravailability;
	}

	public void setDravailability(Availability dravailability) {
		this.dravailability = dravailability;
	}

	@Override
	public String toString() {
		return "Doctor [drid=" + drid + ", drname=" + drname + ", drspecialization=" + drspecialization
				+ ", dravailability=" + dravailability + ", noofpatient=" + noofpatient + "]";
	}
	
	

}
