package com.examples.objectdemo;

public class HeapStackDemo {
	
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void methodA() {
		System.out.println("In method A");
		int a=10;//stack
		float f=20.0f;//stack
		System.out.printf("a=%d f-%f",a,f);
		methodB();
	}

	public static void main(String[] args) {
		int a=10;//stack
		float f=20.0f;//stack
		System.out.printf("a=%d f=%f",a,f);
		methodA();
		methodB();
		System.out.println("In main method after executing methodA and B");

	}

}
