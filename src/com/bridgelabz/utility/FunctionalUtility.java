/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

public class FunctionalUtility {

	/**
	 * Purpose: for replacing the regex into string given by user 
	 * 
	 * Identifier: P1RegEx
	 * 
	 * @param input taken from user
	 * @return replaced string will return
	 */
	public String regexUsername(String input) {
		String username = "<<username>>";
		return username.replaceAll("<<username>>", input);
	}

	/**
	 * Purpose: method for flip coin 
	 * 
	 * Identifier: P2FlipCoin
	 * 
	 * @param numberOfTimesFlipCount count for flip coin
	 */
	public void flipCoin(int numberOfTimesFlipCount) {

		int percentageOfHeads, percentageOfTails;
		int headsCounts = 0, tailsCounts = 0;
		for (int i = 0; i < numberOfTimesFlipCount; i++) {
			if (Math.random() > 0.5) {
				headsCounts++;
			} else {
				tailsCounts++;
			}
		}
		System.out.println("heads : " + headsCounts);
		System.out.println("tails : " + tailsCounts);
		// calculation of percentage
		percentageOfHeads = headsCounts * 100 / numberOfTimesFlipCount;
		percentageOfTails = tailsCounts * 100 / numberOfTimesFlipCount;

		System.out.println("Percentage for heads : " + percentageOfHeads);
		System.out.println("Percentage for tails : " + percentageOfTails);
	}

	/**
	 * Purpose: method for finding year is leap or not 
	 * 
	 * Identifier: P2LeapYear
	 * 
	 * @param year input taken from user
	 */
	
	public void isLeapYear(int year) {
		if(year%4==0||year%400==0&&year%100!=0) {
			System.out.println("Given year is Leap Year");
		}else {
			System.out.println("Given year is Not Leap Year...!");
		}
		
	}

	public void powerOfN(int range) {
		for (int i = 0; i < range; i++) {
			System.out.println((int)Math.pow(i, 2));
		}
		
	}

}
