package com.examples.collections;

import java.util.Objects;

public class Student implements Comparable<Student>{
private String name;
private int age;
private double marks;
public Student(String name, int age, double marks) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
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
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public int hashCode() {
	return Objects.hash(age, marks, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return age == other.age && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
			&& Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
}
@Override
public int compareTo(Student o) {
	return -Double.compare(this.marks, o.marks); //negate it will give the result in descending order.
	//if you negate then
	//98 88  1st > 2nd value -ve number  (will not swap) 88 98
	//88 98  1st < 2nd value +ve number  (Swap) 98 88
	//88 88  1st == 2nd value 0 - equal precedence 88 88
}

}