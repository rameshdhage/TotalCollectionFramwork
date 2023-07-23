package com.comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		
		//Comapre by last name first
	    int result=p1.getLastName().compareTo(p2.getLastName());
	    if(result!=0) {
	    	return result;
	    }
	    
	    // if last name is the same ,compare by first name 
		result =p1.getFirstName().compareTo(p2.getFirstName());
		if(result!=0) {
			return result;
			
		}
		
		//if first name is the same,compare by age
		return Integer.compare(p1.getAge(),p2.getAge());
	}

}
