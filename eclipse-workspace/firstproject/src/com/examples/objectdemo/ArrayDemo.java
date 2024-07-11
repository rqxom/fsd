package com.examples.objectdemo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		System.out.println(arr[0]);
		arr[9]=20;
		System.out.println(arr.length);
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			//To get values for an array from the user
			System.out.println("Enter the value for an index" + i);
			arr[i]=scanner.nextInt(); //get an input from user and assign the value to the array index
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
