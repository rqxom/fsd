package com.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairSum {
	
	public static int sumSecondElements(List<Pair<Integer,Integer>> list) {
		int sum=0;
		for(Pair<Integer,Integer> pair:list) {
			sum =sum+ pair.second;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scanner.nextInt();
		List<Pair<Integer,Integer>> pairs=new ArrayList<Pair<Integer,Integer>>();
		for(int i=0;i<n;i++) {
			int first=scanner.nextInt();
			int second=scanner.nextInt();
			Pair<Integer, Integer> pair=new Pair<Integer,Integer>(first,second);
			pairs.add(pair);
		}
		System.out.println(sumSecondElements(pairs));
	}
	static class Pair<F,S>{
		F first;
		S second;
		public Pair(F first,S second) {
			this.first=first;
			this.second=second;
		}
	}

}
