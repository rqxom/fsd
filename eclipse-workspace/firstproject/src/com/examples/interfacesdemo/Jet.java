package com.examples.interfacesdemo;

public class Jet implements Flyable {
	
	public void methodD() {
		System.out.println("Method D in Jet class");
	}
	public void methodE() {
		System.out.println("Method E in Jet class");
	}

	@Override
	public void canFly() {
		System.out.println("canFly method from interface ");

	}

	@Override
	public void print(String name) {
		System.out.println("Print method inherited from interface and class is " + name);

	}

}
