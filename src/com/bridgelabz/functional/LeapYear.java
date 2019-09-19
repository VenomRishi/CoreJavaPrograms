/******************************************************************************
 *  Purpose: Program is written finding year is leap or not.
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

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please enter year");
		Scanner scanner=new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		int year=scanner.nextInt();
		if(year>1582&&year<9999) {
			utility.isLeapYear(year);
		}else {
			System.out.println("Please enter valid year");
		}
		scanner.close();

	}

}
