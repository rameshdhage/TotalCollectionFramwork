package com.listinterface;
import java.util.ArrayList;
import java.util.Iterator;
public class Detal {
	public static void main(String[] args) {
		
	
	Student s1=new Student(101,"ravi",20);
	Student s2=new Student(102,"ramesh",30);
	Student s3=new Student(103,"ravi",28);
	Student s4=new Student(104,"ravi",27);
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	   Iterator itr=al.iterator();
	   while(itr.hasNext()) {
		  Student st=(Student) itr.next();
		  System.out.println(st.rollno+" " +st.name+ " "+st.age);
	   }
}}
