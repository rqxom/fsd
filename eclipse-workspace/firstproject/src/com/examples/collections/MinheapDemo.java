package com.examples.collections;

import java.util.PriorityQueue;

public class MinheapDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		minHeap.offer(24);
		minHeap.offer(15);
		minHeap.offer(12);
		minHeap.offer(25);
		minHeap.offer(10);
		minHeap.offer(17);
		minHeap.offer(13);
		minHeap.offer(2);
		
		System.out.println(minHeap.peek());
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}

}
