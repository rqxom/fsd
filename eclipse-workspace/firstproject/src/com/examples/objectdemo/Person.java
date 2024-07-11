package com.examples.objectdemo;

import java.util.Objects;

public class Person {
private String firstname;
private String lastname;
private int age;
private char gender;
public Person(String firstname, String lastname, int age) {
	super();//super class constructor - super class is Object
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
}

private static  int noOfPersons;
public Person(String firstname,String lastname,int age,char gender) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.age=age;
	this.gender=gender;
	noOfPersons++;
}
public void displayPersonInfo() {
	System.out.printf("%s %s %d %s",this.firstname,this.lastname,this.age,this.gender);
	System.out.println(" Number of persons created " + noOfPersons);
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public static int getNoOfPersons() {
	return noOfPersons;
}

public static void setNoOfPersons(int noOfPersons) {
	Person.noOfPersons = noOfPersons;
}
@Override
public String toString() {
	if(this.gender=='M')
		return "Mr." + " " + this.firstname + " " + this.lastname + " aged " + this.age;
	else
		return "Ms." + " " + this.firstname + " " + this.lastname + " aged " + this.age;
}
@Override
public int hashCode() {
	return Objects.hash(age, firstname, gender, lastname);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return age == other.age && Objects.equals(firstname, other.firstname) && gender == other.gender
			&& Objects.equals(lastname, other.lastname);
}

}