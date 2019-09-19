/******************************************************************************
 *  Purpose: Program is written Flip coin.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfTimesFlipCount;
		FunctionalUtility utility = new FunctionalUtility();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to flip coin");
		numberOfTimesFlipCount = scanner.nextInt();
		if(numberOfTimesFlipCount>0) {
			utility.flipCoin(numberOfTimesFlipCount);
		}else {
			System.out.println("Please enter positive integer");
		}
		
		scanner.close();

	}

}
