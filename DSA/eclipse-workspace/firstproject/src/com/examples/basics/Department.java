package com.examples.basics;

import java.time.LocalDate;

public class Department {
	private final String name;
	private final LocalDate startdate;
	public Department(String name, LocalDate startdate) {
		super();
		this.name = name;
		this.startdate = startdate;
	}
	public String getName() {
		return name;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", startdate=" + startdate + "]";
	}
	
	
}
