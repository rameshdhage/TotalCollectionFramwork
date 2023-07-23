package com.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
	
	/*HashSet hashSet=new HashSet();
	hashSet.add("ram");
	hashSet.add("shyam");
	hashSet.add(null);
	hashSet.add(10);
	hashSet.add("ram");//rerurn false
	
System.out.println(hashSet);*/

		LinkedHashSet hasset= new LinkedHashSet();
		
		
		HashSet hashSet=new HashSet();
		hashSet.add("ram");
		hashSet.add("shyam");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add("ram");//rerurn false
		
	System.out.println(hashSet);
		
		
}}
