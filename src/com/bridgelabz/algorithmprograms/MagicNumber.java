/******************************************************************************
 *  Purpose: Program is for magic number.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.AlgorithmUtility;


public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt("3");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		AlgorithmUtility.magicNumber(range);

	}

}
