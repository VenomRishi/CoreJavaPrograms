/******************************************************************************
 *  Purpose: Program is for calculating monthly emi.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class MonthlyPayment {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();

		Scanner scanner = new Scanner(System.in);
		int principalLoanAmount, year;
		double rOI, amountToPayForMonth;

		System.out.println("Enter Principal Loan Amount");
		principalLoanAmount = scanner.nextInt();
		System.out.println("Enter Year");
		year = scanner.nextInt();
		System.out.println("Enter Rate Of Interest");
		rOI = scanner.nextDouble();
		amountToPayForMonth = utility.LoanCalculator(principalLoanAmount, year, rOI);
		System.out.println("Amount to Pay :" + amountToPayForMonth + " For Year :" + year);
		scanner.close();

	}

}
