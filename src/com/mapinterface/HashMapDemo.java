package com.mapinterface;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(10,"ram");
		map.put(20,"yegesh");
		map.put(30,"sohan");
		
		Set<Integer>s =map.keySet();
		for(int i:s) {
			System.out.println("key=="+i);
			System.out.println("value="+map.get(i));
		}
	}

}
