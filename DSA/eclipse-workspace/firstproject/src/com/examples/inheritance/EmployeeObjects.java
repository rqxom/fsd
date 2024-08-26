package com.examples.inheritance;

public class EmployeeObjects {
	public static void main(String[] args) {
		Employee e;
		e=new PermanentEmployee("John", 12345, 10000, 1000, 350);
		e.displayPaySlip();
		Employee.methodA();
		
		PermanentEmployee pe = new PermanentEmployee("James", 1, 100, 10, 10);
		PermanentEmployee.methodA();
		
		
		e=new ContractEmployee("James", 12346, 67, 1450.75);
		e.displayPaySlip();
		ContractEmployee.methodA();
		
	}

}
