package com.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {
public static void main(String[] args) {
	
	List<String> names=new ArrayList<String>();
	names.add("James");
	names.add("Adam");
	names.add("Smith");
	names.add("James");
	
	System.out.println(names);
	
	for(String s:names) {
		System.out.println(s);
	}
	
	for(int i=0;i<names.size();i++) {
		System.out.println(names.get(i));
	}
}
}
