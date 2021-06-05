package com.tp.tsw.fundamental;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter year : ");
		int year = scan.nextInt();
		
		/* nested if - if-within-if */
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println(year + " is leap");
			} else {
				System.out.println(year + " is not leap");
			}
		} else {
			if (year % 4 == 0) {
				System.out.println(year + " is leap");
			} else {
				System.out.println(year + " is not leap");
			}
		}
		
		scan.close();
	}
}
