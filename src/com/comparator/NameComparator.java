package com.comparator;

import java.util.Comparator;

import com.listinterface.Employee;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.name.compareTo(emp2.name);
	}

}
