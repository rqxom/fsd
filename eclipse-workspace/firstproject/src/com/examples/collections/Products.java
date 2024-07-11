package com.examples.collections;

import java.util.Objects;

public class Products implements Comparable<Products>{
private int id;
private String name;
private int quantity;
private double price;
public Products(int id, String name, int quantity, double price) {
	super();
	this.id = id;
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public int hashCode() {
	System.out.println("hashCode method is called");
	return Objects.hash(id, name, price, quantity);
}
@Override
public boolean equals(Object obj) {
	System.out.println("In Equals method");
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Products other = (Products) obj;
	return id == other.id && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
}
@Override
public int compareTo(Products o) {
	return Double.compare(this.price, o.price);
}

}