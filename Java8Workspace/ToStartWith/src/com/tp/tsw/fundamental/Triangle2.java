package com.tp.tsw.fundamental;

import java.util.Scanner;

class Triangle2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scan.nextInt();

		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n-i+1 ; j++) {
				System.out.print(j + "\t");	
			}	
			System.out.println();
		}
		scan.close();
	}
}