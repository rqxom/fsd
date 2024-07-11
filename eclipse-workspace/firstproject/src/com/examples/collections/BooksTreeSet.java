package com.examples.collections;

import java.util.TreeSet;

public class BooksTreeSet {

	public static void main(String[] args) {
		Book book1=new Book("Abc", "James", 100);
		Book book2=new Book("cabalsk", "Adam", 102);
		Book book3=new Book("1kjd", "smith", 99);
		Book book4=new Book("asldfj", "Jack", 89);
		
		TreeSet<Book> books=new TreeSet<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		System.out.println(books);
	}

}
