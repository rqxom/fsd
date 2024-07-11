package com.examples.objectdemo;

public class EvenSum {

	public static void main(String[] args)
	{
        int arr[] = {10,11,14,25};
        int even = 0,count=0;
 
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                count++;
        }
 
        System.out.println("Sum of even numbers in array is: " + even);
        System.out.println("Number of even numbers in array is: " + count);
    }
}