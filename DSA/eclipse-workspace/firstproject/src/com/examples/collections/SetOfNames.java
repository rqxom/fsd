package com.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class SetOfNames {

	public static void main(String[] args) {
		Set<String> names=new HashSet<String>();
		
		System.out.println(names.add("James"));
		System.out.println(names.add("Adam"));
		System.out.println(names.add("Smith"));
		System.out.println(names.add("James"));
		
		System.out.println(names);
		
		for(String s:names) {
			System.out.println(s); 
		}

	}

}
