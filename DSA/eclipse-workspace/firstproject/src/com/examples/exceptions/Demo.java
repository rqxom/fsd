package com.examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Demo {
	public static void methodD() throws SQLException{
		System.out.println("Throws SQLException");
	}
	public static void methodC() throws ArrayIndexOutOfBoundsException{
		System.out.println("Throws ArrayIndexOutOfBoundsException");
	}
	public static void methodB() throws ArithmeticException{
		System.out.println("Throws Unchecked Exception");
	}
	public static void methodA() throws IOException{
		System.out.println("Throws Checked Exception");
	}
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader(new File("myfile.txt"));
			methodB();
			methodA();
			methodC();
			methodD();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Inside finally block");
			try {
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
