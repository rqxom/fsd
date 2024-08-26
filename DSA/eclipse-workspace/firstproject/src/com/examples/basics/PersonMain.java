package com.examples.basics;

import java.time.LocalDate;

public class PersonMain {
	public static void main(String[] args) {
		LocalDate dob=LocalDate.of(1990, 10, 30);
		Person p=new Person(dob);
		System.out.println("AGE IS " + p.getAge());
		System.out.println(p);
	}
}
