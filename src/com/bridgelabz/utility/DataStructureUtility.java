/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataStructureUtility {

	/**
	 * Purpose: reading file and return in string
	 * 
	 * @param path path of file
	 * @return returns the string value which is read from file
	 * @throws IOException checking exception for file operation
	 */
	public String readFile(String path) throws IOException {
		String str = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}

	/**
	 * Purpose: writing string into file
	 * 
	 * @param path path of file
	 * @param str  input from user end
	 * @throws IOException checking exception for file operation
	 */
	public void writeFile(String path, String str) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(str);
		bufferedWriter.close();
		System.out.println("File is Written...");
	}

	/**
	 * Purpose: method for checking year is leap or not
	 * 
	 * @param year input from user
	 * @return returns true if leap year else false
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}

	/**
	 * Purpose: calculate which day is this
	 * 
	 * @param day   input from user
	 * @param month input from user
	 * @param year  input from user
	 * @return returns day from 0 to 6 if 0 means sunday and so on
	 */
	public static int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	/**
	 * Purpose: print calendar on console using two dimension array
	 * 
	 * @param day  day of the week
	 * @param days days of the month
	 */
	public static void printCalendar(int day, int days) {
		System.out.println("SUN MON TUE WED THU FRI SAT");
		String[][] cal = new String[6][7];
		int temp;
		switch (day) {
		case 0:
			temp = 1;
			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (temp <= 9) {
						cal[i][j] = temp + "   ";
					} else {
						cal[i][j] = temp + "  ";
					}
					temp++;
					if (temp == days + 1) {
						break;
					}
				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 1:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j == 0) {
						cal[i][j] = "    ";
					} else {
						if (i <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}

			}
			break;
		case 2:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j == 0 || i == 0 && j == 1) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}

			}
			break;
		case 3:
			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j <= 0 || i == 0 && j >= 2) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 4:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j <= 0 || i == 0 && j >= 3) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 5:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j <= 0 || i == 0 && j >= 4) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		case 6:

			temp = 1;

			for (int i = 0; i < cal.length; i++) {
				for (int j = 0; j < cal[i].length; j++) {
					if (i == 0 && j <= 0 || i == 0 && j >= 5) {
						cal[i][j] = "    ";
					} else {
						if (temp <= 9) {
							cal[i][j] = temp + "   ";
						} else {
							cal[i][j] = temp + "  ";
						}
						temp++;
					}
					if (temp == days + 1) {
						break;
					}

				}
				if (temp == days + 1) {
					break;
				}
			}
			break;
		}
		for (int i = 0; i < cal.length; i++) {
			for (int j = 0; j < cal[i].length; j++) {
				if (cal[i][j] == null)
					break;
				System.out.print(cal[i][j]);

			}
			if (cal[i] == null)
				break;
			System.out.println();
		}

	}

}
