package com.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashMap {
	public static void main(String[] args) {
		
		ArrayList<String> maharashtra =new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("nagpur");
		
		ArrayList<String> karnataka=new ArrayList<String>();
		karnataka.add("bangalore");
		karnataka.add("mysore");
		
		ArrayList<String> madhyapradesh=new ArrayList<String>();
		madhyapradesh.add("indore");
		madhyapradesh.add("bhopal");
		
		HashMap<String, ArrayList<String>> hmstate=new HashMap<String,ArrayList<String>>();
		hmstate.put("MH",maharashtra);
		hmstate.put("KAR",karnataka);
		hmstate.put("MP",madhyapradesh);
		
		HashMap<String,HashMap<String,ArrayList<String>>>hmcountry=new HashMap<String,HashMap<String,ArrayList<String>>>();
		hmcountry.put("india",hmstate);
		
	    Set<String> s=hmcountry.keySet();
	    for(String str:s) {
		System.out.println(str);
		System.out.println(hmcountry.get(str));
	}

}}
