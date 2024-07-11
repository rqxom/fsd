package com.examples.objectdemo;

public class StaticAndNonStaticObjs {

	public static void main(String[] args) {
		StaticAndNonStatic.z=50;
		StaticAndNonStatic ss=new StaticAndNonStatic();
		ss.x=5;
		ss.y=10;
		StaticAndNonStatic ss1=new StaticAndNonStatic();
		ss1.x=15;
		ss1.y=20;
		
		System.out.println(ss.x);
		System.out.println(ss.y);
		System.out.println(ss1.x);
		System.out.println(ss1.y);
		System.out.println(ss.z);
		System.out.println(ss1.z);
		ss1.z=40;
		System.out.println(ss.z);
		System.out.println(ss1.z);
		System.out.println(StaticAndNonStatic.z);

	}

}
