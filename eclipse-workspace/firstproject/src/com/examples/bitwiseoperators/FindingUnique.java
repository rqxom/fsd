package com.examples.bitwiseoperators;

public class FindingUnique {
	public static int findUnique(int arr[]) {
		int unique=0;
		for(int i=0;i<arr.length;i++) {
			unique=unique^arr[i];
		}
		return unique;
	}

	public static void main(String[] args) {
		
		int a=0;
		int b=9;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(a ^ b);
		System.out.println(b ^ b);
		int numbers[]= {2,3,7,5,2,3,5};
		int unique=findUnique(numbers);
		System.out.println(unique);
	}

}