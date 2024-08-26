package com.examples.bitwiseoperators;

public class BitwiseOperators {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString(~15));
		int val=~15+1;
		System.out.println(val);
		System.out.println(Integer.toBinaryString(4));
		System.out.println(4<<1);
		System.out.println(8<<1);
		
		System.out.println(Integer.toBinaryString(16));
		System.out.println(16>>1);

	}

}
