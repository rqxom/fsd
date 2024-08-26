package com.examples.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println("Peek " + queue.peek());
		System.out.println("Queue " + queue);
		System.out.println("Remove " + queue.poll());
		queue.offer(50);
		System.out.println("Queue " + queue);
		System.out.println("Remove " + queue.poll());
		System.out.println("Add ");
		queue.offer(60);
		System.out.println("Queue " + queue);
		System.out.println("front element " + queue.peek());
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
