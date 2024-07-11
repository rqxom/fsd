package com.examples.datastructures;

public class FiboUsingDynamicProg {
	
	public static int fibo(int n) {
		int fibResult[]=new int[n];
		if(n<=1)
			return n;
		fibResult[0]=0;
		fibResult[1]=1;
		for(int i=2;i<n;i++) {
			fibResult[i]=fibResult[i-1] + fibResult[i-2];
		}
		for(int i=0;i<n;i++)
			System.out.print(fibResult[i] + " ");
		System.out.println();
		return fibResult[n-1];
	}
	public static void main(String[] args) {
		System.out.println("Last number in the series is " + fibo(9));
	}
}
