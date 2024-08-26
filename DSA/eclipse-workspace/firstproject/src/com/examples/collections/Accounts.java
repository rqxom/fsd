package com.examples.collections;

public class Accounts {
public static void main(String[] args) {
	System.out.println("BANK NAME");
	System.out.println(BankAccount.BANKNAME);
	BankAccount ba1=new BankAccount("12345", "James", 10000);
	BankAccount ba2=new BankAccount("12346", "John", 15000);
	BankAccount ba3=new BankAccount("12357", "Smith", 1000);
//	ba1.displayDetails();//12345  James 10000
	System.out.println("Deposit amount 14000");
	System.out.println(10.20);
	ba1.deposit(14000);// 10000+14000 
//	ba1.displayDetails();//12345  James 24000
	ba1.withdraw(12000);//24000-12000=12000, this.balance=12000
//	ba1.displayDetails();//12345 James 12000
//	ba2.displayDetails();//12346  John 15000
	System.out.println(ba2);//ba2.toString()
	System.out.println(ba1);//default 
	ba1=ba2;
	System.out.println(ba1);
//	String str="Hello World";
//	System.out.println(str);
//	Employee emp=new Employee();
//	System.out.println(emp);
}
}