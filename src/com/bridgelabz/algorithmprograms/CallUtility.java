/******************************************************************************
 *  Purpose: Program is for calling utility for process.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

import com.bridgelabz.utility.AlgorithmUtility;

public class CallUtility {

	public static void main(String[] args) {

		int[] intArr = { 1, 5, 2, 6, 7, 9, 3 };
		int[] intArr2 = { 1, 5, 2, 6, 7, 9, 3 };
		String[] stringArr = { "rishi", "abhi", "mark", "vishnu", "vicky" };
		String[] stringArr2 = { "rishi", "abhi", "mark", "vishnu", "vicky" };

		AlgorithmUtility utility = new AlgorithmUtility();
		// performing particular tasks
		AlgorithmUtility.intInsertionSort(intArr);
		AlgorithmUtility.printIntArr(intArr);
		long time3 = utility.elapsedTime();
		System.out.println("elapsed time for insertion sort of integer is : " + (time3 - utility.start) / 1000.0);
		AlgorithmUtility.intBubbleSort(intArr2);
		AlgorithmUtility.printIntArr(intArr2);
		long time4 = utility.elapsedTime();
		System.out.println("elapsed time for bubble sort of integer is : " + (time4 - utility.start) / 1000.0);
		AlgorithmUtility.stringInsertionSort(stringArr);
		AlgorithmUtility.printStringArr(stringArr);
		long time5 = utility.elapsedTime();
		System.out.println("elapsed time for insertion sort of String is : " + (time5 - utility.start) / 1000.0);
		AlgorithmUtility.stringBubbleSort(stringArr2);
		AlgorithmUtility.printStringArr(stringArr2);
		long time6 = utility.elapsedTime();
		System.out.println("elapsed time for bubble sort of string is : " + (time6 - utility.start) / 1000.0);
		// binary search
		System.out.println("index : " + AlgorithmUtility.intBinarySearch(intArr, 6));
		long time1 = utility.elapsedTime();
		System.out.println("elapsed time for binary search of integer is : " + (time1 - utility.start) / 1000.0);
		Arrays.sort(stringArr);
		System.out.println("index : " + AlgorithmUtility.stringBinarySearch(stringArr, "mark"));
		long time2 = utility.elapsedTime();
		System.out.println("elapsed time for binary search of integer is : " + (time2 - utility.start) / 1000.0);
	}

}
