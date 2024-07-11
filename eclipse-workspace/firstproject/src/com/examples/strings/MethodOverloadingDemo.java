 package com.examples.strings;

public class MethodOverloadingDemo {
	public void printValue(int i) {
		System.out.println("int " +i);
		
	}
	public void printValue(long a) {
		System.out.println("long " +a);
		
	}
	public void printValue(Object o) {
		System.out.println("Object " +o);
		System.out.println(o.getClass());
		System.out.println((o instanceof String));
		
	}
	public void printValue(short a) {
		System.out.println("short " +a);
		
	}
	public void printValue(String str) {
		System.out.println("String " +str);
		
	}
	public void printValue(String str1,String str2) {
		System.out.println(str1+ " " + str2);
		
	}
	public void printValue(short a, long b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		int a=10;
		long l=20;
		Object o="James";
		MethodOverloadingDemo m= new MethodOverloadingDemo();
		m.printValue(a);
		m.printValue(l);
		m.printValue(o);
		m.printValue("John");
		m.printValue("John" ,"Smith");
		m.printValue(10.67f);
	}

}
