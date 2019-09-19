/******************************************************************************
 *  Purpose: Program is for matrix printing.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Matrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();
		int m, n;
		System.out.println("Select option\n 1. for int matrix\n 2.for double matrix\n 3.for boolean matrix");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("chooses integer matrix");
			System.out.println("Enter row and column of matrix");
			m = scanner.nextInt();
			n = scanner.nextInt();
			System.out.println("Enter element for matrix 1");
			int[][] arr = utility.matrixInputInt(m, n);
			utility.print2dArrayInt(arr);

			break;
		case 2:
			System.out.println("chooses double matrix");
			System.out.println("Enter row and column of matrix");

			m = scanner.nextInt();
			n = scanner.nextInt();
			System.out.println("Enter element for matrix 1");
			double[][] doubleArr = utility.matrixInputDouble(m, n);
			utility.print2dArrayDouble(doubleArr);

			break;
		case 3:
			System.out.println("chooses boolean matrix");
			System.out.println("Enter row and column of matrix");
			m = scanner.nextInt();
			n = scanner.nextInt();
			System.out.println("Enter element for matrix 1");
			boolean[][] boolArr = utility.matrixInputBoolean(m, n);
			utility.print2dArrayBoolean(boolArr);

			break;

		default:
			System.out.println("Please select valid option");
			break;
		}

		scanner.close();

	}

}
