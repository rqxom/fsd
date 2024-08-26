package com.examples.collections;

import java.util.Arrays;
import java.util.List;

public class ImmutableListDemo {
public static void main(String[] args) {
	String[] names= {"john","smith","jack","adam"};
	List<String> nameList=Arrays.asList(names);
	
	nameList.set(0, "John Smith");
	nameList.set(1, nameList.get(1).toUpperCase());
	
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
	System.out.println(nameList);
	
	Integer[] numbers = {20,21,45,23,67,54};
	List<Integer> numbersList=Arrays.asList(numbers);
	
	numbersList.set(0, numbersList.get(0)+3);
	
	for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}
	System.out.println(numbersList);
}
}