/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   16-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OOPsUtility {

	/**
	 * Purpose: shuffles the card of deck
	 * 
	 * @param arr array of cards
	 * @return returns shuffle array
	 */
	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}

	/**
	 * Purpose: method for calculate total value of stock
	 * 
	 * @param numberOfShares input from program
	 * @param sharePrice     input from program
	 * @return returns the multiplication of numberOfShares sharePrice
	 */
	public static int calculateTotalValueOfStock(int numberOfShares, int sharePrice) {
		return numberOfShares * sharePrice;
	}

	/**
	 * Purpose: method for creating message using regex
	 * 
	 * @param fullname input from user
	 * @param mobile   input from user
	 * @return returns the message
	 */
	public static String message(String fullname, String mobile, String str) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String strInput = str;
		String str1 = strInput.replaceAll("<<name>>", firstName);
		String str2 = str1.replaceAll("<<fullname>>", fullname);
		String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
		String str4 = str3.replaceAll("Date", dateFormat.format(date));

		return str4;

	}

}
