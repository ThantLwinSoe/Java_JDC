package com.tls;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private Department department;
	
	public Employee(int id, String name, double salary, Department department2) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
