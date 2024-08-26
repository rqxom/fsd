package com.examples.exceptions;

public class Arithmetic {
	public static double divide(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println(divide(12,2));
		try {
			System.out.println(divide(12,1));
			System.out.println(divide(12,1));
			System.out.println("Inside try block");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println(divide(12, 4));
		System.out.println("End");
	}

}
