package com.examples.collections;

public class CustomizedStack {
	private int values[];
	private int capacity;
	private int top;
	public CustomizedStack(int size) {
		values = new int[size];
		top = -1;
		capacity = size;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == capacity - 1;
	}
	public int push(int element) {
		
		if(isFull()) {
			System.out.println("Cannot push any element.. Stack is Full");
			return -1;
		} else {
			values[++top] = element;
			return element;
		}
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty.. cannot pop any element");
			return -1;
		} else {
			int poppedElement = values[top];
			--top;
			return poppedElement;
		}
	}
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return values[top];
		}
	}
}
