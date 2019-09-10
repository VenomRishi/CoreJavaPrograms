package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class P10VendingMaching {

	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int money;
		System.out.println("Enter amount to dispense: ");
		money = scanner.nextInt();
		AlgorithmUtility.vendingMachine(money, notes);
		scanner.close();
	}

}
