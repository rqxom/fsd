package com.examples.objectdemo;

import java.util.Arrays;
public class CountEvenAndOdd {

	public static void main(String[] args) {
		float arr[] = {10,30,11,35,13,21,55,65,78};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Number of even numbers " + evenCount);
		System.out.println("Number of Odd numbers " + oddCount);

	}

}
