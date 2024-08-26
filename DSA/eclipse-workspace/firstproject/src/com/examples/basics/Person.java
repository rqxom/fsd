package com.examples.basics;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private final LocalDate dob;
	private final int age;
	public Person(LocalDate dob) {
		super();
		this.dob = dob;
		this.age=calculateAge();
	}
	private int calculateAge() {
		LocalDate currentDate=LocalDate.now();
		int age=Period.between(dob, currentDate).getYears();
		return age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [dob=" + dob + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		LocalDate dob=LocalDate.of(1990, 10, 30);
		Person p=new Person(dob);
		System.out.println(p);
	}
}
