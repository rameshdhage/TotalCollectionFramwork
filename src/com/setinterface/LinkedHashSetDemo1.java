package com.setinterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
	public static void main(String[] args) {
		
		LinkedHashSet linkedHashSet=new LinkedHashSet();
		
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add("pune");
		linkedHashSet.add("ramesh");
		linkedHashSet.add("ramesh");
		
		
		//System.out.println(linkedHashSet);
		   Iterator itr=linkedHashSet.iterator();
		  while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
			
		}
	}

}
