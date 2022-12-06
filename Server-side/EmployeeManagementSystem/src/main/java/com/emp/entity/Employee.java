package com.emp.entity;

public class Employee {

	private Integer empId;
	private String empName;
	private String empPosition;
	private String email;
	private Integer salary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(Integer empId, String empName, String empPosition, String email, Integer salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
		this.email = email;
		this.salary = salary;
	}
}
