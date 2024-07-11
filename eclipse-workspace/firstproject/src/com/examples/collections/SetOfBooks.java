package com.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class SetOfBooks {
public static void main(String[] args) {
	Set<Book> booksSet=new HashSet<Book>();
	
	booksSet.add(new Book("title1","author1",234.50));
	booksSet.add(new Book("title1","author1",234.50));
	booksSet.add(new Book("title2","author2",1234.50));
	booksSet.add(new Book("title2","author2",1234.50));
	booksSet.add(new Book("title3","author3",2367.50));
	booksSet.add(new Book("title3","author3",2367.50));
	booksSet.add(new Book("title4","author4",5234.50));
	
	System.out.println(booksSet.size());
	System.out.println(new Book("title1","author1",234.50).hashCode());
	System.out.println(new Book("title1","author1",234.50).hashCode());
	System.out.println(new Book("title2","author2",1234.50).hashCode());
	System.out.println(new Book("title2","author2",1234.50).hashCode());
	System.out.println(new Book("title3","author3",2367.50).hashCode());
	System.out.println(new Book("title3","author3",2367.50).hashCode());
	System.out.println(new Book("title4","author4",5234.50).hashCode());
	
	for(Book b:booksSet)
		System.out.println(b);
}
}
