package com.examples.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetManipulation {
	//minus use removeAll method
	
	public static void minus(Set<Integer> set1,Set<Integer> set2) {
		Set<Integer> minus=new HashSet<Integer>(set1);
		minus.removeAll(set2);
		System.out.println("Minus " + minus);
	}
public static void intersection(Set<Integer> set1,Set<Integer> set2) {
	Set<Integer> intersection=new HashSet<Integer>(set1);
	intersection.retainAll(set2);//RETAINS ONLY THE ELEMENTS IN SET1 WHICH IS PRESENT IN SET2 
	System.out.println("Intersection " + intersection);
}

public static void union(Set<Integer> set1,Set<Integer> set2) {
	Set<Integer> unionSet=new HashSet<Integer>(set1);//unionSet will have all elements from set1
	//Add all the elements from set2 to unionSet
	unionSet.addAll(set2);
	System.out.println("UNION " + unionSet);//SET
	Object[] unionArray=unionSet.toArray();//toArray method converts any collection to an array of Objects
	Arrays.sort(unionArray);
	for (int i = 0; i < unionArray.length; i++) {
		System.out.print(unionArray[i] + " "); //Array
	}
	System.out.println();
	//CHECK UNIONSET IS SORTED OR NOT
}
public static void main(String[] args) {
	Set<Integer> set1=Set.of(1,3,5,6,7,8);
	Set<Integer> set2=Set.of(1,5,9,10,34,56);
    System.out.println("SET1 " + set1);
    System.out.println("SET2 " + set2);
    union(set1,set2);
	intersection(set1, set2);
	minus(set1,set2);
}
}
