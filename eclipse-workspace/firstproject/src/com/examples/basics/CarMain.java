package com.examples.basics;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car(1000,"xyz");
		c.startTheCar();
		c.applyBreak();
		c=null;
	}
}
