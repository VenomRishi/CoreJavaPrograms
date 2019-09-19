/******************************************************************************
 *  Purpose: Cohort Program about finding solution to problem (problem is
 *  		 documented into class only)
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-09-2019
 *  @week	 1
 *
 ******************************************************************************/

package com.bridgelabz.cohortproblems;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		/**
		 * Problem statement: input:
		 * 
		 * 143=4
		 * 
		 * 2407=2
		 * 
		 * 25674=6
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("n inputs");
		int n = scanner.nextInt();
		int num;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number");
			num = scanner.nextInt();
			System.out.println(problemMethod(num));
		}

		scanner.close();
	}

	public static String problemMethod(int num) {
		int length;
		int temp=num;
		length = String.valueOf(num).length();
		if (length % 2 == 0)
			return temp + " = " + String.valueOf(num).charAt(0);
		else {
			int firstValue = 0;
			int lastValue;
			lastValue = num % 10;
			while(num>0) {
				firstValue=num%10;
				num=num/10;
			}
			int result=firstValue+lastValue;
			return temp + " = " + result;

		}
	}

}
