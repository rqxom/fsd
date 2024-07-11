package com.examples.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> inList=new LinkedList<Integer>();
		inList.addLast(30);
		inList.add(1);
		inList.add(2);
		inList.add(3);
		
		inList.addFirst(10);
		inList.addLast(20);
		
		inList.add(2,50);
		inList.addLast(69);
		inList.add(70);
		System.out.println(inList);
		
		System.out.println("Element at index 0 is "+inList.get(0));
		System.out.println("Element at last index is "+inList.get(inList.size()-1));
		System.out.println("First Element "+ inList.getFirst());
		System.out.println("Last Element "+ inList.getLast());
		
		System.out.println("Removing the first Element "+inList.removeFirst());
		System.out.println("After removing");
		System.out.println(inList);
		System.out.println("Remove the element 20 " + inList.remove((Integer)20));
		System.out.println(inList);
		Collections.sort(inList);
		System.out.println(inList);
	}

}
