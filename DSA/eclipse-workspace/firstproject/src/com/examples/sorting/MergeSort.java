package com.examples.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = {10 , 9 , 2 , 11 , 23 , 1, 25 , 7 , 34};
		System.out.println("Original array:");
		printArray(array);
		mergeSort(array, 0, array.length - 1);
		System.out.println("\nSorted array:");
		printArray(array);
}
	private static void mergeSort(int array[], int left, int right) {
		if(left < right) {
			int middle = (left + right) / 2;
			System.out.println(middle);
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}
	private static void merge(int[] array, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		for(int i = 0; i < n1; ++i) {
			leftArray[i] = array[left + i];
		}
		for(int j = 0; j < n2; ++j) {
			rightArray[j] = array[middle +1 +j];
		}
		int i = 0, j = 0, k = left;
		while(i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}