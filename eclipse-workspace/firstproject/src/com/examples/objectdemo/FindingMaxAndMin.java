package com.examples.objectdemo;

import java.util.Arrays;

public class FindingMaxAndMin {
	public static int[]sortNumbers(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
 	
	public static int findMax(int arr[]) {
		int max=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	public static int findMin(int arr[]) {
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int numbers[] = {13,11,23,20,10,76,34};
		System.out.println("Minimum value is " + findMin(numbers));
		System.out.println("Maximum value is " + findMax(numbers));
		Arrays.sort(numbers);//sort the array numbers in ascending order, new array will not be created
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
