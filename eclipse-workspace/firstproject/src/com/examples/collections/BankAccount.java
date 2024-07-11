package com.examples.collections;

import com.examples.collections.BalanceInsufficientException;

public class BankAccount {
private String accno;
private String name;
private double balance;
public static final String BANKNAME="ABC BANK";

//final means constant - once the value is assigned it cannot be modified
//class variable BankAccount.bankname (Only one space will be allocated to store bankname)
public BankAccount(String accno,String name,double balance)  {
	this.accno=accno;
	this.name=name;
	if(balance<500)
		throw new BalanceInsufficientException("Minimum Balance should be 500");
	this.balance=balance;
}
public void withdraw(double amount)  {
	if(this.balance-amount<500)
		throw new BalanceInsufficientException("Minimum balance should be 500");
	else
	this.balance=this.balance- amount;//current balance - amount
}
public void deposit(double amount) {//amount is input from the client
	this.balance=this.balance+amount;//current balance add the amount
}
public void displayDetails() {
	System.out.printf("%s  %s  %.2f\n",this.accno,this.name,this.balance);
	//System.out.println();
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
	public String toString() { //is to convert an object to a String
		// TODO Auto-generated method stub
		return "Customer Name:"+ this.name + " AccNo: " + this.accno + " " + "Balance " + this.balance;
	}
}