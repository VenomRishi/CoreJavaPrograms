package com.bridgelabz.OOPs;

import com.bridgelabz.Helper.JsonUtil;
import com.bridgelabz.Model.EmployeeModel;

public class Test {

	public static void main(String[] args) {
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setEmpNo(100);
		employeeModel.setName("swapna");
		employeeModel.setSalary(20000);

		String jsonResult = JsonUtil.javaObjectIntoJson(employeeModel);
		
		System.out.println(jsonResult);
	}

}
