package com.codegnan.Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>(); 	//Genirics:- <DataType> to resolve type casting & type safety.
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");
		stack.push("EEE");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("AAA"));
		System.out.println(stack.search("DDD"));
		System.out.println(stack.search("EEE"));
		System.out.println(stack);
		

	}

}
