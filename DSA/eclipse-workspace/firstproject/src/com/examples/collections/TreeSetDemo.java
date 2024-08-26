package com.examples.collections;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> treesets=new TreeSet<Integer>();
		Set<Integer> hashsets=new HashSet<Integer>();
		treesets.add(10);treesets.add(9);treesets.add(8);treesets.add(15);
		treesets.add(11);treesets.add(1);treesets.add(12);treesets.add(17);treesets.add(5);treesets.add(2);
		
		hashsets.add(10);hashsets.add(9);hashsets.add(8);hashsets.add(15);hashsets.add(11);
		hashsets.add(1);hashsets.add(12);hashsets.add(17);hashsets.add(5);hashsets.add(2);
		
		System.out.println("Treeset " + treesets);
		System.out.println("hashset " + hashsets);
	}

}
