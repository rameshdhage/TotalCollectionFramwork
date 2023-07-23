package com.mapinterface;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<String ,String> treeMap=new TreeMap<String,String>();
		treeMap.put("20","ramesh");
		treeMap.put("40","dhage");
		treeMap.put("30","yeli");
		
		Set<String> s=treeMap.keySet();
		
		for(String i:s) {
			System.out.println("key="+i);
			System.out.println("value="+treeMap.get(i));
			
		}
		
		
	}

}
