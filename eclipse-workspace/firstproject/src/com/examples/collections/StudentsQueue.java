package com.examples.collections;

import java.util.PriorityQueue;

public class StudentsQueue {

	public static void main(String[] args) {
		PriorityQueue<Student> pqueue=new PriorityQueue<Student>();
		pqueue.add(new Student("John",20,98.00));//2nd priority
		pqueue.add(new Student("Adam",21,88.00));//third 
		pqueue.add(new Student("Clara",21,99.00));//1st priority
		pqueue.add(new Student("James",20,78.00));//4th
		pqueue.add(new Student("Smith",20,65.00));//6th
		pqueue.add(new Student("Joe",21,72.00));//5th 

		while(!pqueue.isEmpty()) {
			System.out.println(pqueue.poll());
		}
	}

}