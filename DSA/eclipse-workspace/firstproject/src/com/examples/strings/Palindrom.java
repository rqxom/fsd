package com.examples.strings;

public class Palindrom {
	public static int[] reversingAnArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		return arr;
	}
	public static boolean isPalindrome(String str) {
//		str=str.toLowerCase();
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(Character.toLowerCase(str.charAt(start))!=Character.toLowerCase(str.charAt(end)))
				return false;
			start++;
			end--;
		}
		return true;
	}
		public static void main(String[] args) {
			System.out.println(isPalindrome("abccba"));
			System.out.println(isPalindrome("abc"));
			System.out.println(isPalindrome("Madam"));
			int numbers[]= {10,23,11,9,3,19,21};
			numbers=reversingAnArray(numbers);
			for(int i=0;i<numbers.length;i++) {
				System.out.print(numbers[i]+" ");
			}
	}
}


