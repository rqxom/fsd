package com.examples.basics;

import java.util.ArrayList;
import java.util.List;

public class Student {
private String name;
private List<Course> courses;
public Student(String name) {
	this.name=name;
	this.courses=new ArrayList<Course>();
}
public void addCourse(Course course) {
	this.courses.add(course);
}
@Override
public String toString() {
	return "Student [name=" + name + ", courses=" + courses + "]";
}

}