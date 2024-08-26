package com.examples.inheritance;

public class Triangle extends Shape {
	private int length;
	private int height;
	public Triangle(String color, int length, int height) {
		super(color);
		this.length = length;
		this.height = height;
}
	
	

	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Triangle: length " + this.length + " Height: " + this.height;
	}
	public void calculateArea() {
		double area=0.5 * this.length * this.height;
		System.out.println("Area of Triangle is " + area);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
