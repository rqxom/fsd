package com.examples.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingUniqueElements {

	public static void main(String[] args) {
		List<String> names=List.of("James","Smith","Jack","John","Adam","James","Jack","Adam");
		System.out.println("size of the list is "+names.size());
		//names.add("clara");
		System.out.println("LIST");
		for(String s:names) {
			System.out.println(s);
		}
		
		Set<String> setOfNames=new HashSet<String>(names);
		System.out.println("Size of the set is " + setOfNames.size());
		System.out.println("SET");
		for(String s:setOfNames) {
			System.out.println(s);
		}

	}

}
