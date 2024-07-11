package com.examples.collections;

import java.util.Stack;

public class ReversingStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> reverseStack=new Stack<Integer>();
		stack.push(40);
		stack.push(20);
		stack.push(10);
		stack.push(21);
		stack.push(23);
		System.out.println(stack);
		while(!stack.empty()) {
			reverseStack.push(stack.pop());
		}
		System.out.println(reverseStack);
	}

}
