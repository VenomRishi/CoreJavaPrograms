/******************************************************************************
 *  Purpose: Program is written Replacing the username using regex.
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

public class RegEx {

	public static void main(String[] args) {
		FunctionalUtility utility = new FunctionalUtility();
		String input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.next();
		if(input.length()<3) {
			System.out.println("Please enter valid username");
		}else {
			String output = utility.regexUsername(input);
			System.out.println("Username is + "+output);
		}
		
		scanner.close();

	}

}
