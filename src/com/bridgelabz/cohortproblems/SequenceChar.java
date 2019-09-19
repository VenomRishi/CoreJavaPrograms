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

public class SequenceChar {

	public static void main(String[] args) {
		/**
		 * Problem statement:
		 * 
		 * input:
		 * 
		 * AB yes
		 * 
		 * ABBA yes
		 * 
		 * AABB no
		 * 
		 * AB BA AA AB no
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n inputs");
		int n = scanner.nextInt();
		String str;
		for (int i = 1; i <= n; i++) {
			System.out.println("enter input " + i);
			str = scanner.next();
			if (isPaired(str)) {
				System.out.println(str + " = is true");
			} else
				System.out.println(str + " = is false");
		}

		scanner.close();
	}

	private static boolean isPaired(String str) {
		int length = str.length();
		str = str.toUpperCase();
		boolean isPair = false;
		if (length % 2 != 0)
			return false;
		else {

			char[] charArray = str.toCharArray();
			for (int i = 0; i < charArray.length; i += 2) {
				if (charArray[i] == 'A' && charArray[i + 1] == 'B' || charArray[i] == 'B' && charArray[i + 1] == 'A')
					isPair = true;
				else {
					isPair = false;
					break;
				}
			}

		}
		if (isPair)
			return true;
		else
			return false;
	}

}
