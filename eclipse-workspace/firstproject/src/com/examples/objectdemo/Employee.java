package com.examples.objectdemo;
//POJO - Plain old Java Object
public class Employee {
	// instance Variables
	private long id;
	private String name;
	private int age;
	private String email;
	private double salary;

//default constructor - construct an object
// initialize the instance variables with default values
	public Employee() {

	}
//parameterized constructor
//initialize the instance variables with the constructor parameters
	public Employee(long id, String name, int age, String email, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.salary = salary;
	}
    public Employee(long id) {
    	this.id=id;
    }
    public Employee(long id,String name) {
    	this.id=id;
    	this.name=name;
    }
    public Employee(long id,String name,int age) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
    }
    //accessors - getter methods
	public long getId() {// getter to get id of an employee
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public int getAge() {
		return this.age;
	}

	public double getSalary() {
		return this.salary;
	}
	public void setName(String name) {
		this.name=name;  //to update the value of instance variable name.
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setId(long id) {
		this.id=id;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}