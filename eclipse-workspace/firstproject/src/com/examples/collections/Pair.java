package com.examples.collections;

public class Pair<F,S> {
	F first;
	S second;
	public Pair(F first,S second) {
		this.first=first;
		this.second=second;
	}
	@Override
	public String toString() {
		return "First " + this.first + " " + "Second " + this.second;
	}
	
}
