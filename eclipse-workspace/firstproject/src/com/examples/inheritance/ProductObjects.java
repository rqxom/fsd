package com.examples.inheritance;

public class ProductObjects {
	public static void main(String[] args) {
		Product p1=new Product(1, "Water bottle", 10, 100.00);
		Product p2=new Product(1, "Water bottle", 10, 100.00);
		Product p3=new Product(2, "Pencil", 20, 10);
		Product p4=p1;
		Product p5=null;
		String str="Hello World";
		
		System.out.println("p1 and p2 " + p1.equals(p2));
		System.out.println("p1 and p3 " + p1.equals(p3));
		System.out.println("p1 and p1 " + p1.equals(p1));
		System.out.println("p1 and p4 " + p1.equals(p4));
		System.out.println("p1 and p5 " + p1.equals(p5));
		System.out.println("p1 and str " + p1.equals(str));
//		System.out.println("p5 and p1" + p5.equals(p1));
		
		System.out.println("p1 and p2 " + (p1==p2));
		System.out.println("p1 and p3 " + (p1==p3));
		System.out.println("p1 and p1 " + (p1==p1));
		System.out.println("p1 and p4 " + (p1==p4));
		System.out.println("p1 and p5 " + (p1==p5));
//		System.out.println("p1 and str" + p1.equals(str));
		System.out.println("p5 and p1 " + (p5==p1));
		
	}
}
