/******************************************************************************
 *  Purpose: Program is for merge sort of integer.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class P9MergeSort {

	public static void main(String[] args) {
		AlgorithmUtility utility=new AlgorithmUtility();
		String[] arr= {"rishi","abhi","vishnu","mark","vicky","naufil"};
		int start=0,end=arr.length-1;
		utility.mergeSort(arr,start,end);
		AlgorithmUtility.printStringArr(arr);

	}

	

}
