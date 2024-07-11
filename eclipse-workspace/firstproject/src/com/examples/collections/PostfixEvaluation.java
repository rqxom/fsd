package com.examples.collections;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
	public static int evaluatePostfix(String expression) {//2 3 +    //12+52/21+-+
		Stack<Integer> stack=new Stack<Integer>();
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<expression.length();i++) {
			char c=expression.charAt(i);//2
//			if(Character.isDigit(c))//true
//				stack.push(Character.getNumericValue(c));//convert c into an integer
			if(Character.isLetter(c))
			{
				System.out.println("Enter the value for " + c);
				int val=scanner.nextInt();
				stack.push(val);
			}
			else {
				//c is an operator
				int op2=stack.pop();//3
				int op1=stack.pop();//2
				switch(c) {
				case '*': 
					   stack.push(op1*op2);break;
				case '/':
					   stack.push(op1/op2);break;
				case '-':
					   stack.push(op1-op2);break;
				case '+':
					   stack.push(op1+op2);break;					   
				}
			}
			System.out.println(stack);
		}
		return stack.pop();//result of the expression
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the postfix expression");
		String expression=scan.next();
		int result=evaluatePostfix(expression);
       System.out.println("The result is " + result);
	}

}