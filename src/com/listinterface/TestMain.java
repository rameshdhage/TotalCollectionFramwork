package com.listinterface;
import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public List<Employee>getEmployeeList(){
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(11,"Rahul","pune"));
		list.add(new Employee(21,"Ram","mumbai"));
		return list;
	}
	public static void main(String[] args) {
		TestMain tm=new TestMain();
		System.out.println(tm.getEmployeeList());
	}	
	
	

}
