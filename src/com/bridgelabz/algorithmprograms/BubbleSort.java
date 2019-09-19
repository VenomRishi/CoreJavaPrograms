/******************************************************************************
 *  Purpose: Program is for bubble sort of integer.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.AlgorithmUtility;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		System.out.println("Before sorting");
		AlgorithmUtility.printIntArr(intArr);
		AlgorithmUtility.intBubbleSort(intArr);
		System.out.println("After sorting");
		AlgorithmUtility.printIntArr(intArr);
	}

}
