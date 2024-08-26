package com.examples.collections;

import java.util.Set;
import java.util.TreeSet;

public class ProductsTreeSet {

	public static void main(String[] args) {
		//HashSet - hashCode and equals method.
		Set<Products> products=new TreeSet<Products>();//hashCode, equals, and compareTo method in Comparable interface
		Set<Double> values=new TreeSet<Double>();
		values.add(34.50);
		values.add(54.60);
		values.add(12.00);
		values.add(8.00);
		System.out.println(values);
		//It will compare the objects and sort it in ascending order.
		//To compare two objects , it will call compareTo method in Product class.
		//If compareTo method is not implemented, then it will throw ClassCastException.
		
		products.add(new Products(1, "Notebook", 10, 20));//adding product 1 to the treeset
		products.add(new Products(2,"Pencil",12,10.00));
		products.add(new Products(3,"Pen",10,12.00));
		products.add(new Products(4,"Crayons",12,50.00));

		System.out.println(products);
		

	}

}