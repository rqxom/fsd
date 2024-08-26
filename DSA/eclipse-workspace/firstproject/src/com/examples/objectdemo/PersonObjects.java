package com.examples.objectdemo;

public class PersonObjects {
public static void main(String[] args) {
	//To call static method, Objects are not required
	//Call static method using the class name.

	Person p1=new Person("John","Smith",20,'M');
	p1.displayPersonInfo();
	

	Person p2=new Person("James","Smith",21,'M');
	p2.displayPersonInfo();
	
	Person p3=new Person("Adam","C",22,'M');
	p3.displayPersonInfo();
	
	Person p4=new Person("Clara","J",21,'F');
	p4.displayPersonInfo();
	
	Person p5=new Person(null, null, 0);
	p5.getAge();
	p5.displayPersonInfo();
	
	String s="James";
	System.out.println(s.length());
	
	Person p6=null;
	
	p1.displayPersonInfo();
	System.out.println(p1);
//	p6.displayPersonInfo();
	
	p1.setFirstname("Joe");
	p1.displayPersonInfo();
//	p6.displayPersonInfo();


	
}
}