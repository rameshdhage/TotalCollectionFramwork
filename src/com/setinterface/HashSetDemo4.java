package com.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {
	public static void main(String[] args) {
		
		HashSet hashSet =new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add("ramesh");
		hashSet.add("pune");
		
		Iterator itr=hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
