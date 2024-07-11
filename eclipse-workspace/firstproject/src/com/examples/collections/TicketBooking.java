package com.examples.collections;

import java.util.PriorityQueue;

public class TicketBooking {

	public static void main(String[] args) {
		Passenger passenger1 = new Passenger("John", 20, "M", System.currentTimeMillis()+3000);
		Passenger passenger2 = new Passenger("Clara", 21, "F", System.currentTimeMillis() - 1000);
		Passenger passenger3 = new Passenger("James", 20, "M", System.currentTimeMillis() + 1000);
		PriorityQueue<Passenger> pq=new PriorityQueue<Passenger>();
		pq.offer(passenger1);
		pq.offer(passenger2);
		pq.offer(passenger3);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

}