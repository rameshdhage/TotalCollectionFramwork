package com.listinterface;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo8 {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		arrayList.add(new Employee(20,"Ram",25000));
		arrayList.add(new Employee(30,"sohan",15000));
		
		Iterator<Employee> itr =arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println("employee list>>"+itr.next());
		}
		for(Employee e1:arrayList) {
			System.out.println("data is>>"+e1);
		}
	}

}
