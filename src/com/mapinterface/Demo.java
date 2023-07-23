package com.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> maharashatra=new ArrayList<String>();
		maharashatra.add("maumbai");
		maharashatra.add("pune");
		maharashatra.add("nashik");
		
		ArrayList<String> karnataka=new ArrayList<String>();
		karnataka.add("banglure");
		karnataka.add("mysore");
		
		ArrayList<String> madhyapradesh=new ArrayList<String>();
		madhyapradesh.add("indore");
		madhyapradesh.add("bhopale");
		
		
		HashMap<String,ArrayList<String>> hmstate=new HashMap<String,ArrayList<String>>();
		hmstate.put("MH",maharashatra);
		hmstate.put("KAR",karnataka);
		hmstate.put("MP",madhyapradesh);
		
		HashMap<String,HashMap<String ,ArrayList<String>>>hmcountry=new HashMap<String,HashMap<String,ArrayList<String>>>();
		hmcountry.put("india",hmstate);
		
		Set<String> s=hmcountry.keySet();
		
		for(String str:s) {
			
			System.out.println(str);
			System.out.println(hmcountry.get(str));
			
			
		}
		
		
	}

}
