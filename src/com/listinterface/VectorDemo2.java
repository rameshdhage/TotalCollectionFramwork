package com.listinterface;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
	}

}
