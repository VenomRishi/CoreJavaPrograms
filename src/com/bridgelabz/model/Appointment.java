package com.bridgelabz.model;

public class Appointment {
	private int aptid;
	private int drid;
	private String drname;
	private String dravailability;
	private int ptid;
	private String ptassignname;
	private String ptassignmobile;

	public int getAptid() {
		return aptid;
	}

	public void setAptid(int aptid) {
		this.aptid = aptid;
	}

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

	public String getDravailability() {
		return dravailability;
	}

	public void setDravailability(String dravailability) {
		this.dravailability = dravailability;
	}

	public int getPtid() {
		return ptid;
	}

	public void setPtid(int ptid) {
		this.ptid = ptid;
	}

	public String getPtassignname() {
		return ptassignname;
	}

	public void setPtassignname(String ptassignname) {
		this.ptassignname = ptassignname;
	}

	public String getPtassignmobile() {
		return ptassignmobile;
	}

	public void setPtassignmobile(String ptassignmobile) {
		this.ptassignmobile = ptassignmobile;
	}

}
