package com.tp.tsw.fundamental;

import java.util.Scanner;

public class NaturalNumbersFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter upper limit : ");
		int upperLimit = scan.nextInt();
		for(int index = 1; index <= upperLimit; index++) {
			System.out.println(index);
		}

		scan.close();
		
	}

}
