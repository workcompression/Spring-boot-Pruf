package com.mypractice.collection;

import java.util.Stack;

public class MyStack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("cat");
		stack.push("Dog");
		stack.push("tiger");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
	//	stack.pop();
	//	System.out.println(stack);
	}

}
