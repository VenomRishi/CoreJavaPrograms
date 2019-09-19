/******************************************************************************
 *  Purpose: Program is written gambling simulation.
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

public class Gambler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		int times, stake, goal;
		System.out.println("Enter stake");
		stake=scanner.nextInt();
		System.out.println("Enter goal");
		goal=scanner.nextInt();
		System.out.println("Enter number of times you want to play");
		times=scanner.nextInt();
		utility.gamlingSimulation(stake,goal,times);
		
		scanner.close();

	}

}
