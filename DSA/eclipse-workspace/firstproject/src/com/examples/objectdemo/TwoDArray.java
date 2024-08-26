package com.examples.objectdemo;

public class TwoDArray {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3}, {2}, {1,2,3,4}};
		int numbers[][] = {{10,20,30},{15,16,18},{22,25,27}};
		int matrix[][]=new int[3][2];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col] + " ");
			}
		System.out.println();

	}

}
}