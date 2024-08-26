package com.examples.interfacesdemo;

public class Aeroplane implements Flyable {
	public void methodA() {
		System.out.println("MethodA in aeroplane class");
	}
	public void methodC() {
		System.out.println("MethodC in aeroplane class");
	}
	@Override
	public void canFly() {
		System.out.println("Can fly method in flyable interface");
		
	}
	@Override
	public void print(String name) {
		System.out.println("Print method inherited from interface and class is " + name);
		
	}
	

}
