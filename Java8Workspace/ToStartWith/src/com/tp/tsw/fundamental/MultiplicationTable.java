package com.tp.tsw.fundamental;

import java.util.Scanner;

class MultiplicationTable {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = scan.nextInt();

		for(int index = 1; index <= 10; index++) {
			System.out.println(num + " x " + index + " = " + num*index);
		}

		scan.close();
	}
}