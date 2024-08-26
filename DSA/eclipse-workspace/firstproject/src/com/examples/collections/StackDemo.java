package com.examples.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println(stack.empty());
		stack.push(20);
		System.out.println(stack.size());
		stack.push(40);
		stack.push(50);
		stack.push(70);
		
		System.out.println("Top element is " + stack.peek());
		System.out.println(stack);
		System.out.println("Pop " + stack.pop());
		System.out.println("Pop " + stack.pop());
		System.out.println(stack);
		System.out.println("Push " + stack.push(100));
		System.out.println(stack);
		System.out.println("Peek " + stack.peek());
		
	}

}
