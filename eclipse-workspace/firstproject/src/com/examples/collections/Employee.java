package com.examples.collections;

public class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private double rating;
	public Employee(String name, int age, double rating) {
		super();
		this.name = name;
		this.age = age;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.rating,  o.rating);
	}
	
	
}
