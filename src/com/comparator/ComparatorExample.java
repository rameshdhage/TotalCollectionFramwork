package com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		Person p1=new Person ("ramesh","dhage",30);
		Person p2=new Person ("deepak","shinde",32);
		Person p3=new Person ("satish","puri",20);
		
		PersonComparator comparator=new PersonComparator();
		 List<Person> people=new ArrayList<>();
		 people.add(p1);
		 people.add(p2);
		 people.add(p3);
		 Collections.sort(people,comparator);
		 
		 for(Person person:people) {
			 System.out.println(person);
		 }
	}

}
