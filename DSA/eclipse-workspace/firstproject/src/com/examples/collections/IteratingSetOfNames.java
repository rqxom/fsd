package com.examples.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingSetOfNames {
	public static void main(String[] args) {
		Set<String> names=new HashSet<String>();
		Set<String> fruits=new HashSet<String>();
		names.add("James");
		names.add("John");
		names.add("Adam");
		names.add("Smith");
		names.add("Jack");
		names.add("James");
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		System.out.println("is James present?" + names.contains("James"));
		System.out.println("is Joy present?"+names.contains("Joy"));
		System.out.println("is the set empty" + names.isEmpty());
		System.out.println("is the fruits set empty?" + fruits.isEmpty());
	}

}
