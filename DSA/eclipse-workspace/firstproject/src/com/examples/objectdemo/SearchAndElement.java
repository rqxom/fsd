package com.examples.objectdemo;

import java.util.Scanner;

public class SearchAndElement {
	
	public static void search(int arr[], int searchElement) {
		boolean found = false;
		int index =-1;
		for(int i =0; i<arr.length;i++) {
			if(arr[i] ==searchElement) {
				found=true;
				index=i;
				break;
			}
		}
		if(found)
			System.out.println("Element is found at index" + index);
		else
			System.out.println("Element is not found");
	}

	public static void main(String[] args) {
		int regnos[] = {234,245,263,271,345,355};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to search");
		int searchElement=scanner.nextInt();
		search(regnos,searchElement);
	}

}
