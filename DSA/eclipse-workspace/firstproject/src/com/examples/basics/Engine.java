package com.examples.basics;

public class Engine {
	private int speed;
	private String model;
	public Engine(int speed, String model) {
		super();
		this.speed=speed;
		this.model=model;
	}
	@Override
	public String toString() {
		return "Engine [speed=" + speed + ", model=" + model + "]";
	}
	public void start() {
		System.out.println("Engine started");
	}
	public void stop() {
		System.out.println("Engine stopped");
	}
	
}
