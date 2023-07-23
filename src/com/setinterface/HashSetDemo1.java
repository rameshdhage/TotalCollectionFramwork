package com.setinterface;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		
	
	 HashSet hashSet=new HashSet();
	 
	 hashSet.add(10);
	 hashSet.add(20);
	 hashSet.add(30);
	// hashSet.add(20);//duplicate are not allowed.
     //System.out.println(hashSet);
	 for(Object o:hashSet) {
		 System.out.println(o);
	 }
	 

	
	}
}
