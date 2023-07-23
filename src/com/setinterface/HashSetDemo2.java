package com.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		System.out.println(hashSet);
		/*for(int j:hashSet) {
			System.out.println(j);*/
			
			Iterator itr=hashSet.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
		}
	}


