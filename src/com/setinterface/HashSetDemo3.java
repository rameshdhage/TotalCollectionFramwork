package com.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo3 {
	public static void main(String[] args) {
		
		HashSet hashSet =new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(null);
		
	Iterator itr=hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}
	
	

}
