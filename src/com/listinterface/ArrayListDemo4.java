package com.listinterface;
import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(2.75);
		System.out.println("Size of list is="+al.size());
		System.out.println("List="+al);
		System.out.println(al.contains(80));
		
	}

}
