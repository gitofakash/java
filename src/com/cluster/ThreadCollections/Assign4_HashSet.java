package com.cluster.ThreadCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assign4_HashSet {
	public static void main(String[] args) {
		Set<Employee> hset=new HashSet<Employee>();
		hset.add(new Employee(101, "ABC", "PM", 50000));
		hset.add(new Employee(102, "XYZ", "PMO", 30000));
		hset.add(new Employee(103, "EFG", "ANALYST", 30000));
		
		Iterator<Employee> itr=hset.iterator();
		while(itr.hasNext()) {
			Employee employees=itr.next();
			System.out.println(employees.empId+" "+employees.name+" "
                    +employees.design+" "+employees.salary);
		}
		
	}

}
