package com.hashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(103,"ramesh");
		
		lhm.put(105,"satish");
		lhm.put(104,"bhaskar");
		lhm.put(107,"shivaji");
		lhm.put(106,"ganesh");
		lhm.put(102,"santosh");
		
		System.out.println(lhm);
	}

}
