/******************************************************************************
 *  Purpose: Program is for vending machine.
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

public class VendingMaching {

	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money;
		System.out.println("Enter amount to dispense: ");
		money = scanner.nextInt();
		AlgorithmUtility.vendingMachine(money, notes);
		scanner.close();
	}

}
