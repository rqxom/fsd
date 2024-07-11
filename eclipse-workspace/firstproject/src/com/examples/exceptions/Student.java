package com.examples.exceptions;

public class Student {
private String name;
private int mark;
public Student(String name, int mark) throws InvalidMarkException {
	super();
	this.name = name;
	if(mark>100)//invalid mark, don't construct object,instead throw invalidmarkexception
		throw new InvalidMarkException("Marks cannot be greater than 100");
	else
	this.mark = mark;
}
@Override
public String toString() {
	return "Student [name=" + name + ", mark=" + mark + "]";
}

}