package com.examples.collections;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode method is called...");
		return Objects.hash(author, price, title);
	}
	@Override
	public boolean equals(Object obj) {
//		System.out.println("equals method is called...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	public int compareTo(Book o) {
		return (int)(this.price - o.price);
	}
	
	 
	
}