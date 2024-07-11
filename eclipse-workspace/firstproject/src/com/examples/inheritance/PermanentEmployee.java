package com.examples.inheritance;

public class PermanentEmployee extends Employee {
	private double basicSalary;
	private double hra;
	private double pf;
	

	public PermanentEmployee(String name, long empid, double basicSalary, double hra, double pf) {
		super(name, empid);
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.pf = pf;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
//	public static void methodA() {
//		System.out.println("STATIC METHOD IN PERMANENT EMPLOYEE CLASS");
//	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Basic Salary " + this.basicSalary);
		System.out.println("HRA " + this.hra);
		System.out.println("PF " + this.pf);
		System.out.println(basicSalary + this.hra - this.pf);
	}
	
	@Override
	public String toString() {
		return super.toString() + " basic " + this.basicSalary + " Hra " + this.hra + " pf " + this.pf;
	}

}
