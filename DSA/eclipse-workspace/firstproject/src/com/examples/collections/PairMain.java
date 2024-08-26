package com.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairMain {

	public static void main(String[] args) {
		
		Pair<Integer,Integer> p=new Pair<Integer,Integer>(10,20);
		System.out.println(p);
		
		Pair<String,String> p1=new Pair<String,String>("John "," Smith");
		System.out.println(p1);
		
		Pair<String,Integer> p2=new Pair<String,Integer>("James",467);
		System.out.println(p2);
		
		List<Pair<Integer,Integer>> lists=new ArrayList<Pair<Integer,Integer>>();
		System.out.println("Enter the number of pairs");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the first value for pair " + i);
			int first=scanner.nextInt();
			System.out.println("Enter the second value for pair " + i);
			int second=scanner.nextInt();
			Pair<Integer, Integer> pair=new Pair<Integer,Integer>(first,second);
			lists.add(pair);
		}
		System.out.println(lists);
		int sum=0;
		for(Pair<Integer,Integer> pair:lists) {
			sum = sum + pair.second;
		}
		System.out.println("Sum of second " + sum);
	}

}
