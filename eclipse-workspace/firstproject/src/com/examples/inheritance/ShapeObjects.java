package com.examples.inheritance;

public class ShapeObjects {
public static void main(String[] args) {
	Shape s;
//	s.calculateArea();//since it is referring to Shape object, it will call calculateArea in the Shape class
	
	
	s=new Circle("Yellow",10);//Superclass type variable can refer to subclass objects
	//Since circle is subclass of Shape, shape type can refer to circle object
	s.calculateArea();
	System.out.println(s);
	//now calculateArea in the circle class will be called
	
	s=new Triangle("Green", 10, 23);
	s.calculateArea();
	System.out.println(s);
	
	
	Circle c=new Circle("Green",12);
	c.calculateArea();
	System.out.println(c);//compile time itself it will know it has to call calculateArea in Circle class
	
	
}
}