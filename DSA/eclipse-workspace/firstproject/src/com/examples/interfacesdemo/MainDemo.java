package com.examples.interfacesdemo;

public class MainDemo {

	public static void main(String[] args) {
		MyInterface1 mi=new MyClass();
		mi=new MyClass1();
		MyClass mc=new MyClass();
		mi.methodA();
		mi.methodB();
		
		mc.methodA();
		
		MyClass1 mc1=(MyClass1)mi;
		mc1.methodE();

	}

}
