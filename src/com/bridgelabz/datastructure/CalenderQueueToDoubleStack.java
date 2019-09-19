/******************************************************************************
 *  Purpose: Program is for calendar implemented using Queue which is then
 *  		 put it into two stacks and print the stack at end
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.DataStructureUtility;

public class CalenderQueueToDoubleStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		boolean isLeapYear;
		int days;
		int day;
		int[] daysPerYear = { 31, 28, 30, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter month");
		month = scanner.nextInt();
		if (month > 0 && month <= 12) {
			System.out.println("Enter year");
			year = scanner.nextInt();
			if (year > 1582 && year < 9999) {
				isLeapYear = DataStructureUtility.isLeapYear(year);
				if (isLeapYear && month == 2) {
					days = 29;
					day = DataStructureUtility.calculateDayOfWeek(1, month, year);
					DataStructureUtility.printCalendarUsingQueueDoubleStack(day, days);

				} else {
					days = daysPerYear[month - 1];
					day = DataStructureUtility.calculateDayOfWeek(1, month, year);
					DataStructureUtility.printCalendarUsingQueueDoubleStack(day, days);
				}

			} else
				System.out.println("please enter valid year");
		} else
			System.out.println("Please enter valid month");

		scanner.close();
	}

}
