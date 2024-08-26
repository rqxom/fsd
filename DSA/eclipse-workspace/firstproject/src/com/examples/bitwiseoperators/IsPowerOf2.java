package com.examples.bitwiseoperators;

public class IsPowerOf2 {
	public static boolean isPowerOf2(int value) {
		if((value & (value-1))==0)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		System.out.println(isPowerOf2(10));
		System.out.println(isPowerOf2(16));
		System.out.println(Math.pow(2, -4));

	}

}
