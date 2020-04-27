package com.cluster.ThreadCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	static List<Employee> list = new ArrayList<Employee>();
	static Employee emp = new Employee();

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		empDb.addEmployee(new Employee(102, "employee1", "Engineer", 20000));
		empDb.deleteEmployee(102);
		empDb.listAll();
	}

	boolean addEmployee(Employee e) {
		boolean flag = false;
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e);

		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			if (e.getEmpId() == employee.getEmpId()) {
				empList.add(employee);
				list.add(employee);
				emp.setList(empList);
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Employee with eCode " + e.getEmpId() + " is added");
			return true;
		} else
			return false;

	}

	boolean deleteEmployee(int eCode) {
		boolean flag = false;
		List<Employee> empList = emp.getList();
		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			if (eCode == employee.getEmpId()) {
				empList.remove(employee);
				list.remove(employee);
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Employee with eCode " + eCode + " is deleted");
			return true;
		} else
			return false;

	}

	String showPaySlip(int eCode) {
		boolean flag = false;
		double salary = 0.0;
		List<Employee> empList = emp.getList();
		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			if (eCode == employee.getEmpId()) {
				flag = true;
				salary = employee.getSalary();
				break;
			}
		}
		if (flag == true) {
			return "Payslip of employee with eCode " + eCode + " is :" + salary;
		} else
			return "Invalid eCode";

	}

	void listAll() {
		System.out.println("List of Employees\n*******************");
		List<Employee> eList = emp.getList();

		for (int i = 0; i < list.size(); i++) {

			Employee employees = list.get(i);
			System.out
					.println(employees.empId + " " + employees.name + " " + employees.design + " " + employees.salary);
		}

	}

}
