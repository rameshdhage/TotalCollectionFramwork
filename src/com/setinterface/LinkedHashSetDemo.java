package com.setinterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> linkedHashSet =new LinkedHashSet();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		
		System.out.println(linkedHashSet);
		
		for(int i:linkedHashSet) {
			System.out.println(i);
		}
		
		
		
	}

}
