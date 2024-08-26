package com.examples.inheritance;

public class ComparingStrings {
	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = new String("Hello World");
		String str3 = "Hello World";
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		
		System.out.println("str1 and str2 " + str1.equals(str2));
		
		String str4 = new String("WELCOME");
		String str5 = "Hello World";
	}

}
