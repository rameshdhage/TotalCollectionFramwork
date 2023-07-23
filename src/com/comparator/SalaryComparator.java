package com.comparator;

import java.util.Comparator;

public class SalaryComparator implements  Comparator<Student> {

	@Override
	public int compare(Student employee1, Student employee2) {
		if(employee1.salary==employee2.salary)
		return 0;
		else if(employee1.salary>employee2.salary)
			return 1;
		else
			return -1;
		
	}
	

}
