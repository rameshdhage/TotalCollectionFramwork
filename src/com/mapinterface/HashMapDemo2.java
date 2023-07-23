package com.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String> ();
		map.put(10,"ram");
		map.put(20,"yogesh");
		map.put(30,"shyam");
		
		
	Set<Integer> s=map.keySet()	;
	Iterator itr=s.iterator();
		while(itr.hasNext()) {
			int i=(int) itr.next();
			System.out.println("key="+i);
			System.out.println("value="+map.get(i));
		}
	}

}