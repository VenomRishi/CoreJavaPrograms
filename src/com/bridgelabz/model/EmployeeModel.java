package com.bridgelabz.model;

import java.io.Serializable;

public class EmployeeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empNo;
	private String name;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
