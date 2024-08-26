package com.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingListElement {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("James");
		names.add("John");
		names.add("Adam");
		names.add("Smith");
		names.add("Jack");
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i));
		
		List<Integer> listOfIntegers=Arrays.asList(1,44,13,11,45,67);
		Iterator<Integer> itr1=listOfIntegers.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
			
	}

}
