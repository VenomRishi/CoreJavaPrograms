/******************************************************************************
 *  Purpose: Program is for prime numbers 0 to 1000.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class P2PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility utility = new AlgorithmUtility();
		for (int i = 0; i <= 1000; i++) {
			if (utility.isPrime(i)) {
				System.out.print(i + " ");
			}
			
		}

	}

}
