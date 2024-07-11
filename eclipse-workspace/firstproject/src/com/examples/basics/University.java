package com.examples.basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
	private List<Department> departments;
	public University(String name) {
		this.name=name;
		this.departments=new ArrayList<Department>();
	}
	public void addDepartment(Department department) {
		this.departments.add(department);
	}
	public List<Department> getDepartments(){
		return this.departments;
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		University university=new University("XYZ");
		Department department1=new Department("IT",LocalDate.of(1990, 3, 10));
		Department department2=new Department("CSE",LocalDate.of(1989, 10, 10));
		
		university.addDepartment(department1);
		university.addDepartment(department2);
		System.out.println(university.getName());
		System.out.println(university.getDepartments());
	}
}
