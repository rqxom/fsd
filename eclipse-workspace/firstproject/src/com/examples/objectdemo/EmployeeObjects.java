package com.examples.objectdemo;

public class EmployeeObjects {
public static void main(String[] args) {
	Employee emp=new Employee();
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	
	//update name of emp
	emp.setName("John");
	System.out.println(emp.getName());
    Employee emp1=new Employee(123,"Adam",20,"adam@gmail.com",10000.00);
    System.out.printf("%d %s %d %s %f ",emp1.getId(),emp1.getName(),emp1.getAge(),emp1.getEmail(),emp1.getSalary());
   
    Employee e=new Employee(124);
    e.setName("James");
}
}