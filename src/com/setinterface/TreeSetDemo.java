package com.setinterface;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		 TreeSet treeSet=new TreeSet();
		 treeSet.add("ramesh");
		 treeSet.add("pune");
		 treeSet.add("shivaji");
		 //treeSet.add("ramesh") duplicate are not allowed
		// treeSet.add("10"); runtime get error
		// treeSet.add("null"); run time will get
		 
		 System.out.println("first set"+treeSet);// sorting elements
		 
		 TreeSet treeSet1=new TreeSet();
		 treeSet1.add(50);
		 treeSet1.add(10);
		 treeSet1.add(100);
		 
		 System.out.println("Second set"+treeSet1);
		 
		 
		 
	}

}
