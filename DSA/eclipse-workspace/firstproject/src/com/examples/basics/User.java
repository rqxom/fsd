package com.examples.basics;

public class User {
	private String name;
	private int age;
	private char gender;
	private String aadhar;
	public User(String name, int age, char gender, String aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", aadhar=" + aadhar + "]";
	}
	
}
