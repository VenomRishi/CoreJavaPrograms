/******************************************************************************
 *  Purpose: Program is for finding distinct triplets.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class SumOfThreeIsZero {

	public static void main(String[] args) {
		FunctionalUtility utility=new FunctionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for elements");
		int count=scanner.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[count];
		for (int i = 0; i < count; i++) {
			arr[i]=scanner.nextInt();
		}
		utility.sumOfThreeIsZero(arr);
		
		scanner.close();

	}

}
