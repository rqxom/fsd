package com.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<Integer>(5);
		list1.add(2);
		
		list1.add(4);
		list1.add(5);
		list1.add(7);
		list1.add(8);
		list1.add(10);
		System.out.println("size of the list " + list1.size());
		
		ListIterator<Integer> listIter=list1.listIterator();
		
		while(listIter.hasNext()) {
			int value=listIter.next();
			System.out.print(value+" ");
		}
		System.out.println();
		
		while(listIter.hasPrevious()) {
			int value=listIter.previous();
			System.out.print(value+" ");
		}
	}

}
