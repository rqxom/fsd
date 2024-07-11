package com.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentsData {
	Map<Integer, Student> students=new HashMap<Integer, Student>();
	public Student getStudent(int rollno) {
		return students.get(rollno);
	}

	public static void main(String[] args) {
		StudentsData sd=new StudentsData();
		sd.students.put(100, new Student("James", 20, 80));
		sd.students.put(101, new Student("John", 21, 90));
		sd.students.put(102, new Student("Adam", 19, 78));
		sd.students.put(103, new Student("Smith", 22, 98));
		sd.students.put(104, new Student("Clara", 21, 67));
		sd.students.put(105, new Student("Joe", 22, 68));
		sd.students.put(106, new Student("Tom", 23, 78));
		
		System.out.println(sd.getStudent(100));
		System.out.println(sd.getStudent(104));
		System.out.println(sd.getStudent(200));
	}

}
