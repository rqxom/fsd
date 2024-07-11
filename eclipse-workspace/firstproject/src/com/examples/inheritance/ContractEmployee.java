package com.examples.inheritance;

class ContractEmployee extends Employee {
	private int hrsWorked;
	private double ratePerHr;
	

	public ContractEmployee(String name, long empid, int hrsWorked, double rateperHr) {
		super(name, empid);
		this.hrsWorked = hrsWorked;
		this.ratePerHr = rateperHr;
	}
	public int getHrsWorked() {
		return hrsWorked;
	}
	public void setHrsWorked(int hrsWorked) {
		this.hrsWorked = hrsWorked;
	}
	public double getRateperHr() {
		return ratePerHr;
	}
	public void setRatePerHr(double rateperHr) {
		this.ratePerHr = rateperHr;
	}
	public static void methodA() {
		System.out.println("STATIC METHOD IN CONTRACT EMPLOYEE CLASS");
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Total Hrs worked " + this.hrsWorked);
		System.out.println("Rate per hour " + this.ratePerHr);
		System.out.println(this.hrsWorked * this.ratePerHr);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Total hrs Worked " + this.hrsWorked + " Rate Per Hr " + this.ratePerHr;
	}

}
