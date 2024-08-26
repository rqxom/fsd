package com.examples.inheritance;

import com.examples.objectdemo.Person;

public class ComparingObjects {

	public static void main(String[] args) {
		
		Person p = new Person("John","Smith",20,'M');
		Person p1 = new Person("John","Smith",20,'M');
		
//		if(p1==p)
//			System.out.println("BOTH ARE SAME");
//		else
//			System.out.println("THEY ARE DIFFERENT");
//		p1=p;
//		if(p1==p)
//			System.out.println("BOTH ARE SAME");
//		else
//			System.out.println("THEY ARE DIFFERENT");
//		int a=10;
//		int b=10;
//		if(a==b)
//			System.out.println("a and b are same");
//		else
//			System.out.println("a and b are different");
//		
//		System.out.println(p1.equals(p));
		PermanentEmployee pe = new PermanentEmployee("Adam", 12, 100, 10, 10);
//		System.out.println(p1.equals(pe));
		
		System.out.println(p.getClass());
		System.out.println("John".getClass());
		System.out.println(pe.getClass());
		Object obj=new Person("James", "Smith", 10, 'M');
		Person p2=(Person)obj;
		System.out.println(p1.equals(p));
		System.out.println(p1.equals(p2));
		
		Object str="Hello World";
		String s=(String)str;
		System.out.println(s.length());
			
		

	}

}
