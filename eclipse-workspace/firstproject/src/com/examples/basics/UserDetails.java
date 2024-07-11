package com.examples.basics;

public class UserDetails {

	public static void main(String[] args) {
		User user=new User("John", 20, 'M', "3949-8934-9384");
		System.out.println("Before updating name");
		System.out.println("USER : " + user);
		user.setName("John Smith");
		System.out.println("After updating name");
		System.out.println("USER: " + user);
	}

}
