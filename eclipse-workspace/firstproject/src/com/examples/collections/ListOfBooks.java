package com.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfBooks {

	public static void main(String[] args) {
		Book book1=new Book("Title1","Author1",139.00);
		Book book2=new Book("Title2","Author2",2093.00);
		Book book3=new Book("Title3","Author3",1345.00);
		
		List<Book> booksList=new ArrayList<Book>();
		booksList.add(book1);
		booksList.add(book2);
		booksList.add(book3);
		booksList.add(new Book("Title4","Author4",678.00));
		
		System.out.println(booksList);
		
		System.out.println(booksList.contains(new Book("Title1","Author1",139.00)));
	}

}
