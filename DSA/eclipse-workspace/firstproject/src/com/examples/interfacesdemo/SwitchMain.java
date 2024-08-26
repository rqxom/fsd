package com.examples.interfacesdemo;

public class SwitchMain {
	public static void main(String[] args) {
		Switch s=new Fan();
		Switch.staticmethod();
		s.turn_on();
		s.turn_off();
		s.defaultMethod();
		System.out.println("is fan switched on" + s.isOn());
		
		Switch s1=new TV();
		Switch.staticmethod();
		s1.turn_on();
		s1.turn_off();
		s1.defaultMethod();
		System.out.println("is TV switched on" + s1.isOn());
	}

}
