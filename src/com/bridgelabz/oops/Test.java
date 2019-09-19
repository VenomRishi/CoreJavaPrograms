package com.bridgelabz.oops;

import com.bridgelabz.helper.JsonUtil;
import com.bridgelabz.model.EmployeeModel;

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
