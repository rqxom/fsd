package com.examples.strings;

public abstract class CreatingStrings {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Smith");
		StringBuffer sbuffer = new StringBuffer("Smith");
		sbuffer.append("John");
		sbuffer.append(1);
		sb.append("John");
//		sb.append("Welcome");
		StringBuilder sb1 = new StringBuilder("Smith");
//		StringBuilder sb2=sb;
		System.out.println(sb.equals(sb1));
		System.out.println(sb.compareTo(sb1));
		int c=20;
		Integer a=10;
		Integer b=20;   
		System.out.println(a.compareTo(b));
		System.out.println(sb);
		System.out.println(sb1);

	}

}
