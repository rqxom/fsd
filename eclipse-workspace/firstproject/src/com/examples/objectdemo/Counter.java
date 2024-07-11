package com.examples.objectdemo;

public class Counter {
	int instanceCount;
	static int staticCount;
	
	public Counter() {
		staticCount++;
		instanceCount++;
	}
	public int getInstanceCount() {
	return this.instanceCount;
}
public static int getStaticCount() {
	return staticCount;
}


	public static void main(String[] args) {
		Counter c1=new Counter();
		System.out.println("Instance Count " + c1.getInstanceCount());
		System.out.println("static Count " + c1.getStaticCount());
		Counter c2=new Counter();
		System.out.println("Instance Count " + c2.getInstanceCount());
		System.out.println("static Count " + c2.getStaticCount());

	}

}
