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

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OOPsUtility {
	/**
	 * Purpose: regex for no special charater in string
	 * 
	 * @param name user input
	 * @return if valid true else false
	 */
	public boolean isValidName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();

	}

	/**
	 * Purpose: regex for email
	 * 
	 * @param email user input
	 * @return if valid true else false
	 */
	public boolean isValidEmail(String email) {
		// TODO Auto-generated method stub ^(.+)@(.+)$
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/**
	 * Purpose: regex for international phone number
	 * 
	 * @param phone user input
	 * @return if valid true else false
	 */
	public boolean isValidMobile(String phone) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
		Matcher matcher = pattern.matcher(phone);
		return matcher.matches();
	}

	/**
	 * Purpose: regex for username
	 * 
	 * @param userid input from user
	 * @return returns true if valid else returns false
	 */
	public boolean isValidUsername(String userid) {
		// TODO Auto-generated method stub a-zA-Z0-9
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
		Matcher matcher = pattern.matcher(userid);
		return matcher.matches();
	}

	/**
	 * Purpose: regex for password
	 * 
	 * @param password input from user
	 * @return returns true if valid else returns false
	 */
	public boolean isValidPassword(String password) {

		/*
		 * (?=.*[a-z]) : This matches the presence of at least one lowercase letter.
		 * (?=.*d) : This matches the presence of at least one digit i.e. 0-9.
		 * (?=.*[@#$%]) : This matches the presence of at least one special character.
		 * ((?=.*[A-Z]) : This matches the presence of at least one capital letter.
		 * {6,16} : This limits the length of password from minimum 6 letters to maximum
		 * 16 letters.
		 */
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
	/**
	 * Purpose: shuffles the card of deck
	 * 
	 * @param arr	array of cards
	 * @return	returns shuffle array
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

}
