package com.examples.inheritance;

public abstract class Employee {
	private String name;
	private long empid;
	public Employee(String name, long empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public static void methodA() {
		System.out.println("THIS IS A STATIC METHOD IN EMPLOYEE CLASS");
	}
	public abstract void calculateSalary();
	public final void displayPaySlip() {
		System.out.println("Name of an Employee: " + this.getName());
		System.out.println("Employee Id " + this.getEmpid());
		this.calculateSalary();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.empid;
	}
}