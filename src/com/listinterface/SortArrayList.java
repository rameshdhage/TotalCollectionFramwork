package com.listinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Volkswagen");
		list.add("Toyata");
		list.add("Porsche");
		list.add("Ferrari");
		list.add("Mercedes-Benz");
		list.add("Audi");
		list.add("Rolls-Royce");
		list.add("Bmw");
		System.out.println("Before sorting :"+list);
		
		Collections.sort(list);
		System.out.println("After sorting the arrayList:"+list);
		
		for(String o:list) {
			System.out.println(o);
		}
	}

}
