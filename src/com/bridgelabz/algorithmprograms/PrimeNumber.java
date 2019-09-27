/******************************************************************************
 *  Purpose: Program is for prime numbers 0 to 1000.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.AlgorithmUtility;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (AlgorithmUtility.isPrime(i)) {
				System.out.print(i + " ");
			}
			
		}

	}

}
