package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class P13MonthlyPayment {

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
