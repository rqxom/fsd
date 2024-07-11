package com.examples.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(1);
		pQueue.add(4);
		pQueue.add(12);
		pQueue.add(9);
		
		while(!pQueue.isEmpty()) {
			System.out.println(pQueue.poll());
		}
		
		PriorityQueue<String> strQueue=new PriorityQueue<String>();
		strQueue.offer("James");
		strQueue.offer("Adam");
		strQueue.offer("Anil");
		strQueue.offer("John");
		strQueue.offer("Clara");
		strQueue.offer("Smith");
		
		System.out.println("Front person " + strQueue.peek());
		while(!strQueue.isEmpty()) {
			System.out.println(strQueue.poll());
		}
	}

}
