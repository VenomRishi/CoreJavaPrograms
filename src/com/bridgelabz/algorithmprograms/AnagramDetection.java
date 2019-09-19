/******************************************************************************
 *  Purpose: Program is for calculating Anagram Detection.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramDetection {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string 1");
		str1=scanner.next();
		System.out.println("enter string 2");
		str2=scanner.next();
		AlgorithmUtility utility = new AlgorithmUtility();
		boolean isAnagram=utility.isAnagram(str1,str2);
		if(isAnagram) {
			System.out.println("Two String are anagram");
		}else {
			System.out.println("Two String are not anagram");
		}
		scanner.close();
	}

}
