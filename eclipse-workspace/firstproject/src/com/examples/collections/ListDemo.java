package com.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List list1=new ArrayList();
		List<Integer> list2=new ArrayList<Integer>();
		List<Double> list3=new ArrayList<Double>();
		
		list1.add("James");
		list1.add(1);
		list1.add(123.40);
		list1.add('a');
		
		for(Object o:list1) {
			System.out.println(o);
			String s=(String)o;
			System.out.println(s.length());
		}
		
		list2.add(1);
		list2.add(10);
		list2.add(21);
		list2.add(30);
		
		for(Integer i:list2) {
			System.out.println(i);
		}
		
		list3.add(15.4);
		list3.add(167.6);
		for(double d:list3) {
			System.out.println(d);
		}

	}

}
