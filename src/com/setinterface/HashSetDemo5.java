package com.setinterface;

import java.util.HashSet;

public class HashSetDemo5 {
	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add("ramesh");
		hashSet.add("pune");
		System.out.println(hashSet.remove("ramesh"));
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains("pune"));
		
		
		
		HashSet hashSet1=new HashSet();
		hashSet1.add(40);
		hashSet1.add(50);
		hashSet1.add(60);
		
		hashSet.addAll(hashSet1);
		System.out.println(hashSet);
	}

}
