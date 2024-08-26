package com.examples.collections;

import java.util.Comparator;
import java.util.Date;

public class Passenger implements Comparable<Passenger>{
private String name;
private int age;
private String gender;
private long timestamp;

public Passenger(String name, int age, String gender, long timestamp) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.timestamp = timestamp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getTimestamp() {
	return timestamp;
}
public void setTimestamp(long timestamp) {
	this.timestamp = timestamp;
}
@Override
public String toString() {
	return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + ", timestamp=" + new Date(timestamp) + "]";
}
public static Comparator<Passenger> AGE_COMPARATOR=new Comparator<Passenger>() {

	@Override
	public int compare(Passenger o1, Passenger o2) {
		return (o1.age - o2.age) + (o1.gender.compareTo(o2.gender));
	}
	
};
@Override
	public int compareTo(Passenger o) {
		return Long.compare(this.timestamp, o.timestamp);//lowest timestamp has highest priority
	}
}