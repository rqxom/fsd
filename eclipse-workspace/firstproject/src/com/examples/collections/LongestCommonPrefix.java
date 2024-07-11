package com.examples.collections;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		int minLength=strs[0].length();
		for(int i=1;i<strs.length;i++) {
			if(strs[i].length()<minLength)
				minLength=strs[i].length();
		}
		System.out.println("Minlength " + minLength);
		for(int i=0;i<minLength;i++) {
			char c=strs[0].charAt(i);
			for(int j=1;j<strs.length;j++) {
				if(c!=strs[j].charAt(i)) {
					return strs[0].substring(0,i);
				}
			}
		}
		return strs[0].substring(0,minLength);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] strs=new String[n];
		for(int i=0;i<n;i++) {
			strs[i] = scanner.next();
		}
		String longestPrefix=longestCommonPrefix(strs);
		if(longestPrefix.length()==0)
			System.out.println("no common prefix");
		else
			System.out.println(longestPrefix);
	}

}
