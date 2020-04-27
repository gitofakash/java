package com.cluster.ThreadCollections;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	int empId;
	String name;
	String design;
	double salary;
	List<Employee> list=new ArrayList<Employee>();
	
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name, String design, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.design = design;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
	

}
