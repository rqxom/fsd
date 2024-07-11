package com.examples.bitwiseoperators;

public class BitwiseDemo {

	public static void main(String[] args) {
		int b=13;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(5 & 10);
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(10));
		System.out.println("5 & 10 = "+ Integer.toBinaryString(5 & 10));
		System.out.println("5 | 10 = "+ Integer.toBinaryString(5 | 10));
		System.out.println(5 | 10);
		byte b1=-14;
		byte b2=14;
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(5^7));

	}

}
