package com.comparableinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
   public static void main(String[] args) {
   ArrayList<Employee> al=new ArrayList<Employee>();
   al.add(new Employee(101,"ramesh",12000));
   al.add(new Employee(100,"satish",10000));
   al.add(new Employee(102,"deepak",9000));
   
   Collections.sort(al);
   
   for(Employee emp:al) {
	   System.out.println("id>>"+emp.getId()+"name>>"+emp.getName()+"salary>"+emp.getSalary());
   }



}}
