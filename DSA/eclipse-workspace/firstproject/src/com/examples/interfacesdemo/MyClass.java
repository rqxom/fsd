package com.examples.interfacesdemo;

public class MyClass implements MyInterface1 {

	@Override
	public void methodA() {
		System.out.println("methodA in MyClass");

	}

	@Override
	public void methodB() {
		System.out.println("methodB in MyClass");

	}

	@Override
	public void methodC() {
		System.out.println("methodC in MyClass");

	}
	public void methodD() {
		System.out.println("MyClass methodD");
	}

}
