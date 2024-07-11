package com.examples.interfacesdemo;

public class Main {
	public static void main(String[] args) {
		
		Flyable f=new Aeroplane();
		f.canFly();
		f.print("Aeroplane");
		
		f=new Jet();
		f.canFly();
		f.print("Jet");
		
		Aeroplane a=new Aeroplane();
		a.canFly();
		a.print("Aeroplane");
		a.methodA();
		a.methodC();
	}

}
