package com.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {
	public static void main(String[] args) {
		Map <String,String> map=new HashMap<String,String>();
		
		map.put("ram","patil");
		map.put("shyam","deshmukh");
		
		map.forEach((k,v)->System.out.println("key="+k+",value="+v));
		
	}

}
