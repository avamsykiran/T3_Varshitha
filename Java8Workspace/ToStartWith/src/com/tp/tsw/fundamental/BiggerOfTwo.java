package com.tp.tsw.fundamental;

import java.util.Scanner;

public class BiggerOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int firstNumber, secondNumber;
		System.out.println("Enter first number : ");
		firstNumber = scan.nextInt();
		System.out.println("Enter second number : ");
		secondNumber = scan.nextInt();

		if (firstNumber > secondNumber)
			System.out.println(firstNumber + " is Big");
		else
			System.out.println(secondNumber + " is Big");

		scan.close();

	}

}
