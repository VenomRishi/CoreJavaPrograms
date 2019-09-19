/******************************************************************************
 *  Purpose: Program is for finding String permutation
 *  		 using iterative and recursive methods.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class StringPermutation {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		str = scanner.next();

		System.out.println("Printing Iterative Permutation");
		FunctionalUtility.permutationIterative(str);

		System.out.println("\nPrinting Recursive Permutation");
		FunctionalUtility.permutationRecursion(str, 0, str.length() - 1);

		FunctionalUtility.compareTwoPermutation();

		scanner.close();

	}

}
