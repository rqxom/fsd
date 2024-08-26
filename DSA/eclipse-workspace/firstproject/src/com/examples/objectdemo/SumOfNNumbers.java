package com.examples.objectdemo;

public class SumOfNNumbers {
	
	public static int sumOfDigits(int num) {
		if(num==0)
			return 0;
		else
			return num%10 + sumOfDigits(num/10);
	}
	
	public static int fibonacci(int num) {
		if(num<=1)
			return num;
		else
			return fibonacci(num-2) + fibonacci(num-1);
	}
	
	public static int factorial(int n) {
		if(n<1)
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static int sum(int n) {
		if(n<1)
			return 0;
		else {
			System.out.println(n);
			return n + sum(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=sum(5);
		System.out.println("Result is " + result);
		int fact=factorial(5);
		System.out.println("5! is " + fact);
		for(int i=0;i<6;i++)
			System.out.print(fibonacci(i)+ " ");
		System.out.println();
		int digitSum=sumOfDigits(1456);
		System.out.println(digitSum);

	}

}
