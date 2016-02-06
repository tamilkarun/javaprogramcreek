package com.javaprogramcreek.tamil;

import java.io.IOException;
import java.util.Stack;

/**
 * @author tkarunan
 * LeetCode – Evaluate Reverse Polish Notation
 */

public class ReversePolishNotation {
	/**
	 * @author tkarunan
	 * Native Solution - switch string is accepted from JDK 1.7
	 */
	public static int evalRPN1(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
 
		Stack<String> stack = new Stack<String>();
 
		for (String t : tokens) {
			System.out.println("\n" +"String is " + t + "\n");
			if (!operators.contains(t)) { //push to stack if it is a number
				System.out.println("Pushing to stack: " + t);
				stack.push(t);
			} else {//pop numbers from stack if it is an operator
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					System.out.println("\n" + a + " + " +  b + "\n");
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					System.out.println("\n" + b + " - " +  a + "\n");
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					System.out.println("\n" + a + " * " +  b + "\n");
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					System.out.println("\n" + b + " / " +  a + "\n");
					break;
				}
			}
		}
 
		returnValue = Integer.valueOf(stack.pop());
 
		return returnValue;
	}
	/**
	 * @author tkarunan
	 * Accepted Solution using index for switch cases
	 */
	public static int evalRPN2(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
 
		Stack<String> stack = new Stack<String>();
 
		for (String t : tokens) {
			System.out.println("\n" +"String is " + t + "\n");
			if (!operators.contains(t)) { //push to stack if it is a number
				System.out.println("Pushing to stack: " + t);
				stack.push(t);
			} else {//pop numbers from stack if it is an operator
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				switch (index) {
				case 0:
					stack.push(String.valueOf(a + b));
					System.out.println("\n" + a + " + " +  b + "\n");
					break;
				case 1:
					stack.push(String.valueOf(b - a));
					System.out.println("\n" + b + " - " +  a + "\n");
					break;
				case 2:
					stack.push(String.valueOf(a * b));
					System.out.println("\n" + a + " * " +  b + "\n");
					break;
				case 3:
					stack.push(String.valueOf(b / a));
					System.out.println("\n" + b + " / " +  a + "\n");
					break;
				}
			}
		}
 
		returnValue = Integer.valueOf(stack.pop());
 
		return returnValue;
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] tokens = new String[] { "2", "1", "+", "3", "*","4","*","4","-","5","+","9","/" };
		System.out.println(evalRPN2(tokens));
	}

}
