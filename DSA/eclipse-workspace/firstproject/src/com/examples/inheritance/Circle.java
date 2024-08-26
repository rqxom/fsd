package com.examples.inheritance;
//circle inherits all the methods from Shape + Object
public class Circle extends Shape {
private int radius;

public Circle(String color, int radius) {
	super(color);//super refers to Shape , pass color to the shape class
	//first shape object will get constructed
	this.radius = radius;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
@Override
	public String toString() {
		return super.toString() + " Circle: radius " + this.radius;
	}
//override calculateArea in Circle
@Override    //providing different implementation for a superclass method in the subclass
	public void calculateArea() { 
	    double area=3.14 *  this.radius * this.radius;
		System.out.println("Area of circle is " + area);
	}
}