/******************************************************************************
 *  Purpose: Program is written finding Prime Factor n uptil range.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class PrimeFactor {

	public static void main(String[] args) {
		FunctionalUtility utility=new FunctionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for prime factors");
		int n=scanner.nextInt();
		utility.primeFactor(n);
		
		
		scanner.close();
	}

}
