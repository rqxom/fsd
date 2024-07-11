package com.examples.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class EmployeeRating {
	public static void main(String[] args) {
		PriorityQueue<Employee> employees=new PriorityQueue<Employee>(Collections.reverseOrder());
		employees.offer(new Employee("James",29,5.5));
		employees.offer(new Employee("Smith",20,6.7));
		employees.offer(new Employee("Adam",27,8.9));
		employees.offer(new Employee("Clara",22,9.1));
		employees.offer(new Employee("John",23,4.5));
		employees.offer(new Employee("Jack",28,7.5));
		employees.offer(new Employee("Tom",21,9.5));
		employees.offer(new Employee("Anie",23,6.5));
		System.out.println("Minimum Rating " + employees.poll());
	}
}
