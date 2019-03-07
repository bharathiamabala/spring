package com.spring;

public class Employee {

	private String empName;
	private int empId;
	private long empSal;
	private String designation;
	
	
	public Employee(String empName, int empId, long empSal, String designation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.designation = designation;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getEmpSal() {
		return empSal;
	}

	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", designation="
				+ designation + "]";
	}

	
	




}
