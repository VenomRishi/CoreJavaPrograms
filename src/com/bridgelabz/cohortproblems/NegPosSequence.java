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

import java.util.Arrays;

public class NegPosSequence {
	public static void main(String[] args) {
		/**
		 * Problem statement:
		 * 
		 * input:
		 * 
		 * 1,3,5,-1,-5,100
		 * 
		 * 
		 * -5,-1,1,3,5,100
		 * 
		 * output:
		 * 
		 * -5,1,-1,3,5,100
		 */
//		System.out.println("Enter elements count");
		// Scanner scanner = new Scanner(System.in);
		// int n = scanner.nextInt();
		// int[] arr = new int[n];
		int[] arr = { 1, 3, 5, -1, -5, 100, 80, -8, -10, 1000, 2000 };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter element " + i);
//			arr[i] = scanner.nextInt();
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int negativeindex = 0, positiveindex = 0, saveNeg = 0, savePos = 0;
		boolean isFirst = true;
		// -8, -5, -1, 1, 3, 5, 80, 100
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && isFirst) {
				negativeindex = i;
				saveNeg = negativeindex;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] > 0) {
						positiveindex = j;
						savePos = positiveindex;
						break;
					}
				}

				System.out.print(arr[negativeindex] + " " + arr[positiveindex] + " ");
				isFirst = false;

			}
			if (!isFirst && arr[negativeindex] < -1) {
				System.out.print(arr[++saveNeg] + " " + arr[++savePos] + " ");
				negativeindex++;
			} else {
				if (savePos != arr.length - 1)
					System.out.print(arr[++savePos] + " ");
			}

		}
		// scanner.close();
	}
}
