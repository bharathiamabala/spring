package com.employee.annotaionsEx;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("bha")
	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

}
