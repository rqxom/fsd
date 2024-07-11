package com.examples.interfacesdemo;

public class Fan implements Switch {
	boolean on=Switch.default_state;

	@Override
	public void turn_on() {
		this.on=true;
		System.out.println("Fan is switched on...");

	}

	@Override
	public void turn_off() {
		this.on=false;
		System.out.println("Fan is switched off...");

	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}

}
