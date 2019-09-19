/******************************************************************************
 *  Purpose: Program is for binary search of string.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class BinarySearchIO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = AlgorithmUtility
				.getFromFile("/home/admin1/eclipse-workspace/BridgelabzSectionD/src/com/bridgelabz/files/names");
		String[] strArr = str.split(",");
		AlgorithmUtility.stringInsertionSort(strArr);
		AlgorithmUtility.printStringArr(strArr);
		System.out.println("Enter key to search");
		String key = scanner.next();
		int index = AlgorithmUtility.stringBinarySearch(strArr, key);
		if (index >= 0)
			System.out.println("Key found at index : " + index + " which is : " + strArr[index]);
		else if(index==-1) {
			System.out.println("Key not found");
		}
		
		scanner.close();
	}

}
