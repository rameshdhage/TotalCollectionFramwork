package com.listinterface;
import java.util.ArrayList;
import java.util.Collections;

public class ArrrayListDemo6 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ramesh");
		al.add("Satish");
		al.add("Krishna");
		al.add("Pawan");
		al.add("pushpa");
		al.add("Deepak");
		al.add("Rakesh");
		al.add("Laman");
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
