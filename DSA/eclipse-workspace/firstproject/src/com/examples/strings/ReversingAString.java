package com.examples.strings;

public class ReversingAString {
	public StringBuilder getReverse(String name) {
		StringBuilder sb=new StringBuilder(name);
		return sb.reverse();
	}
	public static void main(String[] args) throws java.lang.Exception {
		String str="Hello";
		StringBuilder sb=new StringBuilder(str);
		StringBuilder sb1=sb.reverse();
		System.out.println(str);
		System.out.println(sb1);
		System.out.println(str.equals(sb1.toString()));
		StringBuilder sb2=new StringBuilder();
		sb2.append(1);
		sb2.append(2);
		sb2.append(3);
		sb2.append(1);
		System.out.println(sb2);
		System.out.println(sb2.reverse());
	}

}
