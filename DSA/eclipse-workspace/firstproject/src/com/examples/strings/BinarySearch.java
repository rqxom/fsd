package com.examples.strings;

import java.util.Arrays;

public class BinarySearch {
	
	public static int search(int arr[],int searchElement) {
		
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==searchElement)
				return mid;
			else if(arr[mid]<searchElement)
				low=mid+1;
			else if(arr[mid]>searchElement)
				high=mid-1;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,24,11,9,2,5,45,16,87};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int index=search(arr, 90);
		System.out.println("Index for 90 is " + index);
		index=search(arr, 10);
		System.out.println("Index for 10 is " + index);
		index=search(arr, 45);
		System.out.println("Index for 45 is " + index);
	}
}
