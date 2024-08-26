package com.examples.sorting;

import java.util.Iterator;

public class BubbleSortDemo {
	
	public static void bubbleSort(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				printArray(arr);
			}
			printArray(arr);
		}
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int numbers[]= {10,30,11,29,2,1,9,28,23};
		printArray(numbers);
		bubbleSort(numbers);

	}

}
