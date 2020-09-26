package com.techelevator;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	
	
	public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	public double getAnnualSalary() {
		return this.annualSalary;
	}
	public void raiseSalary(double percent) {
		double decimal = percent/100;
		annualSalary = annualSalary * (1 + decimal);
	}
	
	
	
}
