package com.bl.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1, num3, count, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of count: ");
		count = sc.nextInt();
		System.out.print(num1 + " " + num2);// printing 0 and 1

		for (i = 2; i < count; ++i) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
