package com.examples.basics;

public class Car {
	private Engine engine;
	public Car(int speed, String model) {
		this.engine=new Engine(speed,model);
	}
	public void startTheCar() {
		this.engine.start();
	}
	public void applyBreak() {
		this.engine.stop();
	}
}
