package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

import com.comparableinterface.Employee;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,"ram",90000));
		al.add(new Employee(102,"ajay",8000));
		al.add(new Employee(103,"ashok",7000));
		
		//Collections.sort(al,new NameComparator());
		
		for(Employee emp:al) {
System.out.println("id>>"+emp.getId()+"name>>"+emp.getName()+"salary>>"+emp.getSalary());
		}
		
	}

}
