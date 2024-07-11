package com.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class SetOfProducts {
public static boolean searchProduct(Set<Product> products,String productname) {
	for(Product p:products) {
		if(p.getName().equalsIgnoreCase(productname))
			return true;
	}
	return false; //All the elements in the set is checked and if the product not found, then return false.
	
}
public static void main(String[] args) {
	Set<Product> products=new HashSet<Product>();
	products.add(new Product(1,"Pen",12,100.00));
	products.add(new Product(2,"Pencil",10,50.00));
	products.add(new Product(3,"Notebook",12,120.00));
	products.add(new Product(3,"Notebook",12,120.00));
	products.add(new Product(4,"Crayons",12,102.00));
	System.out.println("The size of the set is " + products.size());
	System.out.println(products);
	System.out.println("Does Set contains Crayons?"+searchProduct(products, "CRAYONS"));
	System.out.println("Does set contains 'Water Bottle'?"+ searchProduct(products, "Water bottle"));
	System.out.println(products.contains(new Product(1,"Pen",12,100.00)));
	System.out.println(products.contains(new Product(10,"Crayons",12,102.00)));
	
}
}