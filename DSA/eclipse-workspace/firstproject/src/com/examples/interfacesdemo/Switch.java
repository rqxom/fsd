package com.examples.interfacesdemo;

public interface Switch {
	
	boolean default_state=false;
	void turn_on();
	void turn_off();
	boolean isOn();
	static void staticmethod() {
		System.out.println("static method in Switch interface");
	}
	default void defaultMethod() {
		if(isOn())
			turn_off();
		else
			turn_on();
	}

}
