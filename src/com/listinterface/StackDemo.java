package com.listinterface;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push("J");
		stack.push("M");
		stack.push("k");
		
		System.out.println(stack);
		System.out.println(stack.search("X"));
	}

}
