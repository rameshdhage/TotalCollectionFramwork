package com.setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashSetDemo2 {
	public static void main(String[] args) {
		ArrayList arrayList =new ArrayList();
		arrayList.add(50);
		arrayList.add(75);
		arrayList.add(100);
		arrayList.add(75);
		
		System.out.println("List is"+arrayList);
		
		HashSet hashSet =new HashSet(arrayList);
	System.out.println(hashSet);
	Iterator itr=hashSet.iterator();
		
		while(itr.hasNext());
		System.out.println(itr.next());
		
		
	}

}
