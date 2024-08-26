package com.examples.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {

	public static void main(String[] args) {
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
		maxHeap.offer(24);
		maxHeap.offer(15);
		maxHeap.offer(12);
		maxHeap.offer(25);
		maxHeap.offer(10);
		maxHeap.offer(17);
		maxHeap.offer(13);
		maxHeap.offer(2);
		
		System.out.println(maxHeap.peek());
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
	}

}
