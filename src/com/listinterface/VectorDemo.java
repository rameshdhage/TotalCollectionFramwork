package com.listinterface;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("Ajay");
		vector.add("velocity");
		vector.add("pune");
		vector.add("pune");
		System.out.println(vector);
		
		/*while(vector.contains("pune")) {
			vector.remove("pune");
		}*/
		System.out.println("New vector is ="+vector);
		
		System.out.println("vector size="+vector.size());
		System.out.println("vector capacity="+vector.capacity());
		System.out.println("Index="+vector.get(2));
	
}
}
