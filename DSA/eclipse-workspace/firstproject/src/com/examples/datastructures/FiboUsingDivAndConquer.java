package com.examples.datastructures;

public class FiboUsingDivAndConquer {
	public static int fibo(int n) {
		if(n<1)
			return 0;
		if(n==1)
			return 1;
		int result1=fibo(n-2);
		int result2=fibo(n-1);
		System.out.println("Result1 " + result1 + " " + "Result2 " + result2);
		return result1 + result2;
	}
	public static void main(String[] args) {
		System.out.println(fibo(7));
	}
}
