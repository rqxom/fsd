package com.examples.collections;

public class MyGenericClass<E> {
	E value;
	
	public MyGenericClass(E value) {
		this.value=value;
	}

	public static void main(String[] args) {
		MyGenericClass<Integer> mc=new MyGenericClass<Integer>(10);
		
		MyGenericClass<String> mc1=new MyGenericClass<String>("John");
		
		MyGenericClass<Book> mc2=new MyGenericClass<Book>(new Book("title", "author", 100.00));
	}

}
