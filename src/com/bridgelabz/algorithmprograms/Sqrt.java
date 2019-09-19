/******************************************************************************
 *  Purpose: Program is for finding square root using newton's law.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility utility=new AlgorithmUtility();
		Scanner scanner = new Scanner(System.in);
		int c;
		double result;
		System.out.println("Enter Nonnegative value");
		c = scanner.nextInt();
		if (c > 0) {
			result = utility.findSquareRootUsingNewtonsMethod(c);
			System.out.println("Square Root of " + c + " using Newtons Law is " + result);
		} else {
			System.out.println("Please enter positive value..");
		}
		
		scanner.close();
	}

}
