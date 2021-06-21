package com.tp.tsw.fundamental;

import java.util.Scanner;

class MultiplicationTable2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number : ");
		int startNum = scan.nextInt();
		System.out.print("Enter end number : ");
		int endNum = scan.nextInt();

		for(int num = startNum; num <= endNum; num++) {
			for(int index = 1; index <= 10; index++) {
				System.out.println(num + " x " + index + " = " + num*index);
			}
			System.out.println();
		}

		scan.close();
	}
}
