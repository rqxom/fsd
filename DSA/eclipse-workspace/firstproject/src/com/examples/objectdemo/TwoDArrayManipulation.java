package com.examples.objectdemo;

public class TwoDArrayManipulation {
	
	public static void sumOfMatrices(int matrix1[][],int matrix2[][]) {
		
		if(matrix1.length!=matrix2.length)
			System.out.println("cannot find the sum of matrices");
		else if(matrix1[0].length!=matrix2[0].length)
			System.out.println("cannot find the sum of matrices");
		else {
			int matrix3[][]=new int[matrix1.length][matrix1[0].length];
			for(int row=0;row<matrix1.length;row++) {
				for(int col=0;col<matrix1[row].length;col++) {
					matrix3[row][col]= matrix1[row][col] + matrix2[row][col];
				}
			}
			for(int row=0;row<matrix3.length;row++) {
				for(int col=0;col<matrix3[row].length;col++) {
					System.out.print(matrix3[row][col]+" ");
				}
				System.out.println();
		}
	}
	}
	public static void sumOfAntiDiagonol(int arr[][]) {
		int sum=0;
		int col=arr.length-1;
		int row=0;
		while(row<arr.length) {
			sum=sum+arr[row++][col--];
		}
		System.out.println("Sum of anti diagonol is " + sum);
	}
	public static void sumOfMainDiagonal(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i][i];
		}
		System.out.println("Sum of main diagnal is " + sum);
	}
	public static void sumOfColumns(int arr[][]) {
		int columnSum[] = new int[arr[0].length];
		for(int row=0;row<arr.length;row++) {
			int sum=0;
			for(int col=0;col<arr[row].length;col++) {
				sum=sum + arr[col][row];
			}
			columnSum[row]=sum;
		}
		for(int i=0;i<columnSum.length;i++)
			System.out.print(columnSum[i] + " ");
		System.out.println();
	}

	public static void SumOfRows(int arr[][]) {
		int rowSum[]=new int[arr.length];
		for(int row=0;row<arr.length;row++) {
			int sum=0;
			for(int col=0;col<arr[row].length;col++) {
				sum=sum+arr[row][col];
			}
			rowSum[row]=sum;
		}
		for(int i=0;i<rowSum.length;i++)
			System.out.print(rowSum[i] + " ");
		System.out.println();
			}
	
	public static void main(String[] args) {
		int marks[][] = {{56,78,62},{55,75,65},{87,73,70}};
		int matrix1[][] = {{10,10,10},{20,20,20},{30,30,30}};
		int matrix2[][] = {{1,2,3},{1,2,3},{1,2,3}};
		SumOfRows(marks);
		sumOfColumns(marks);
		sumOfMainDiagonal(marks);
		sumOfAntiDiagonol(marks);
		sumOfMatrices(matrix1,matrix2);
	}
}
	

