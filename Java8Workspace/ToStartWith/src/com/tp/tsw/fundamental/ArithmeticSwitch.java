package com.tp.tsw.fundamental;

import java.util.Scanner;

public class ArithmeticSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter arithmetic operator : ");
		String operator = scan.nextLine();
		System.out.println("Enter first number : ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = scan.nextInt();

		int result;
		switch (operator) {
			case "+" : 	result = firstNumber + secondNumber;
						System.out.println("Sum = " + result);
					   	break;
			case "-" : 	result = firstNumber - secondNumber;
						System.out.println("Difference = " + result);
						break;
			case "*" : 	result = firstNumber * secondNumber;
						System.out.println("Product = " + result);
						break;
			case "/" :  result = firstNumber / secondNumber;
						System.out.println("Quotient = " + result);
						break;
			case "%" :  result = firstNumber % secondNumber;
						System.out.println("Remainder = " + result);
						break;
			default  :  System.out.println("Invalid Arithmetic Operator");
						break;
			
		} 
		
		scan.close();
	}

}
