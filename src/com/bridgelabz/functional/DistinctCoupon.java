/******************************************************************************
 *  Purpose: Program is written Distinct Coupon.
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

public class DistinctCoupon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();
		System.out.println("enter number for generate coupons");
		int range = scanner.nextInt();
		int count=utility.distinctCoupon(range);
		System.out.println(count + " N times loop runs for finding distinct");
		scanner.close();

	}

}
