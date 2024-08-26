package com.examples.inheritance;

public abstract class Shape {
private String color;

public Shape(String color) {
	super();//super class constructor, which is constructor in Object class 
	this.color = color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
protected abstract void calculateArea();
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape: color " + this.color;
	}
}