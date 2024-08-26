package com.examples.exceptions;

public class InvalidMarkException extends RuntimeException{

	public InvalidMarkException() {
		super();
	}

	public InvalidMarkException(String message) {
		super(message);
	}

}