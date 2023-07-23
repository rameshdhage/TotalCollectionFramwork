package com.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("ram","patil");
	    map.put("ajay","deshmukh");
	    
	    Iterator<Map.Entry<String,  String>> itr=map.entrySet().iterator();
	    
	    while(itr.hasNext()) {
	    	Map.Entry<String,String>entry=itr.next();
	    	System.out.println("key="+entry.getKey()+"value="+entry.getValue());
	    }
	}

}
