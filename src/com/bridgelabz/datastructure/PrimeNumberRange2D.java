/******************************************************************************
 *  Purpose: Program is written for finding prime number between given range
 *  		 and put this prime numbers into 2d array
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.DataStructureUtility;

public class PrimeNumberRange2D {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		int[][] primeNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (DataStructureUtility.isPrime(j)) {
					j1++;
				}
			}
			primeNumber[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {

				if (DataStructureUtility.isPrime(j)) {
					primeNumber[i][j2] = j;
					j2++;
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primeNumber.length; i++) {
			for (int j = 0; j < primeNumber[i].length; j++)
				System.out.print(primeNumber[i][j] + " ");
			System.out.println();
		}

	}

}
