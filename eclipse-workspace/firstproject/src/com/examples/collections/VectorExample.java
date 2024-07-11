package com.examples.collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<String> namesVector=new Vector<String>();
		namesVector.add("John");
		namesVector.add("James");
		System.out.println("Before update");
		System.out.println(namesVector);
		namesVector.set(1, "Jack");
		System.out.println("After update");
		System.out.println(namesVector);
		namesVector.add("Clara");
		namesVector.add("Smith");
		System.out.println("List before removing");
		System.out.println(namesVector);
		
		System.out.println("removed an element " + namesVector.remove(0));
		System.out.println("removed an element " + namesVector.remove("joe"));
		System.out.println("After removing");
		System.out.println(namesVector);

	}

}
