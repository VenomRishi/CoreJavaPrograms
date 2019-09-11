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
