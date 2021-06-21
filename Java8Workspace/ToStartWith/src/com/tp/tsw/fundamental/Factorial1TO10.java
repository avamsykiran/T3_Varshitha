package com.tp.tsw.fundamental;

class Factorial1TO10 {
	public static void main(String [] args) {
		int fact;
		for(int num = 1; num <= 10; num++) {
			fact = 1;
			for(int index = 1; index <= num; index++) {
				fact *= index;
			}
			System.out.println(num + "! = " + fact);
		}
	}
}