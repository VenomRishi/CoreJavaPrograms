/******************************************************************************
 *  Purpose: Program is written finding Harmonic series n uptil range.
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

public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		System.out.println("Enter n for Harmonic Series");
		int range=scanner.nextInt();
		
		utility.harmonicSeries(range);
		
		scanner.close();

	}

}
