package com.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		Map<Student,String> map= new HashMap<Student,String>();
		map.put(new Student(10,"vinod"),"class11");
		map.put(new Student(10,"vinod"),"class11");
		System.out.println(map);
	}

}
