package com.examples.collections;
class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data+ " " + this.next;
	}
	
}
public class CustomLinkedList {
	Node head;
	
	public CustomLinkedList() {
		head = null;
	}
	public void addElement(int position,int data) {
	}
	public void addElement(int data) {
		
		Node newNode = new Node(data);
		
		System.out.println("head is " + head);
		if(head==null)
			head=newNode;
		else {
			Node current=head;
			while(current.next!=null)
				current=current.next;
			current.next=newNode;
		}
		System.out.println("After adding "+ data);
		System.out.println("head is " + head);
}
	public void removeElement(int data) {
		if(head==null)
		{
			System.out.println("List is null");
			return;
		}
		if(head.data==data) {
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.data!=data) {
			current=current.next;
		}
		if(current.next!=null)
			current.next=current.next.next;
		else
			System.out.println("Element not found");
	}
	public void printList() {
		Node current=head;
		while(current!=null)
		{
			
			System.out.println(current.data);
			current=current.next;
		}
	}
	public boolean contains(int data) {
		if(head==null)
			return false;
		Node current=head;
		while(current!=null && current.data!=data) {
			current=current.next;
		}
		if(current==null)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		CustomLinkedList list=new CustomLinkedList();
		list.addElement(10);
		list.printList();
		list.addElement(20);
		list.printList();
		list.addElement(30);
		list.printList();
		list.addElement(40);
		list.printList();
		System.out.println("Remove 50");
		list.removeElement(50);
		list.printList();
		System.out.println(list.contains(20));
		System.out.println(list.contains(21));
	}
}
