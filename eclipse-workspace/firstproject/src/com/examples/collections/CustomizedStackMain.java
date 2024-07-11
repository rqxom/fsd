package com.examples.collections;

public class CustomizedStackMain {

	public static void main(String[] args) {
		CustomizedStack cs=new CustomizedStack(5);
		System.out.println("Is stack empty? " + cs.isEmpty());
		System.out.println("Is stack full? " + cs.isFull());
		System.out.println(cs.push(10));
		System.out.println(cs.push(20));
		System.out.println(cs.push(30));
		System.out.println(cs.push(40));
		System.out.println(cs.push(50));
		System.out.println(cs.push(60));
		while(!cs.isEmpty()) {
			System.out.println(cs.pop());
		}
		System.out.println("is stack empty " + cs.isEmpty());
	}

}
