package com.examples.basics;

import java.util.ArrayList;
import java.util.List;

public class Course {
private String coursename;
private String instructorname;
private List<Student> students;
public Course(String coursename,String instrutorname) {
	this.coursename=coursename;
	this.instructorname=instrutorname;
	this.students=new ArrayList<Student>();
}
public void addStudent(Student student) {
	this.students.add(student);
}
@Override
public String toString() {
	return "Course [coursename=" + coursename + ", instructorname=" + instructorname + ", students=" + students + "]";
}
public static void main(String[] args) {
	Student s1=new Student("John");
	Student s2=new Student("James");
	Student s3=new Student("Adam");
    

	Course c1=new Course("Java","Smith");
	Course c2=new Course(".Net","Roy");
	Course c3=new Course("Mainframe","Clara");
	
	s1.addCourse(c1);//Adding course to student
	s1.addCourse(c3);//Adding course to student
	
	s2.addCourse(c2);
	
	s3.addCourse(c3);
	
	c1.addStudent(s1);
	c3.addStudent(s1);
	c3.addStudent(s3);
	c2.addStudent(s2);
}
}