package com.examples.collections;

public class CustomizedQueue {
	int[] array;
	int front;
	int rear;
	int size;
	
	public CustomizedQueue(int capacity) {
		array=new int[capacity];
		size=capacity;
		front=-1;
		rear=-1;
	}
	public boolean isEmpty() {
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(front==0 && rear==(size-1)) {
			return true;
		}
		return false;
	}
	public int enqueue(int element) {
		if(isFull()) {
			System.out.println("QUEUE IS FULL...");
			return -1;
		} else {
			if(front==-1)
				front=0;
			rear++;
			array[rear]=element;
			System.out.println(element + " added into the queue");
			return element;
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("QUEUE IS EMPTY...CANNOT DELETE ANY ELEMENT");
			return -1;
		} else {
			int element=array[front];
			if(front >= rear) {
				front = -1;
			rear = -1;
		} else {
			front++;
		}
		System.out.println("Deleted element " + element);
		return element;
	}
}
public int peek() {
	if(isEmpty())
	{
		System.out.println("QUEUE IS EMPTY");
		return -1;
	}
	else
		return array[front];
}
public void printQueue() {
	if(isEmpty()) {
		System.out.println("Queue is Empty");
	} else {
		for(int i = front; i <= rear; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
}
}
}
