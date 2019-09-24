/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {
	public final long start;

	/**
	 * Purpose: constructor of class
	 * 
	 */
	public AlgorithmUtility() {
		start = System.currentTimeMillis();
	}

	/**
	 * Purpose: method for finding two string are anagram or not
	 * 
	 * Identifier: P1AnagramDetection
	 * 
	 * @param str1 input from user
	 * @param str2 input from user
	 * @return true or false depending upon anagram or not
	 */
	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Purpose: method for finding prime number or not
	 * 
	 * Identifier: P2PrimeNumber
	 * 
	 * @param num input from user
	 * @return returns true if prime else not prime
	 */
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	/**
	 * Purpose: method is check for palindrome number
	 * 
	 * Identifier: P3PrimeAnagram
	 * 
	 * @param num input taken
	 * @return return true is num is palindrome else false
	 */
	public boolean isPalindrome(int num) {
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Purpose: method for integer binary search
	 * 
	 * Identifier: P4CallUtility, P6BinarySearchIO
	 * 
	 * @param arr input from user
	 * @param key input from user
	 * @return returns index of key searched else returns -1
	 */
	public static int intBinarySearch(int[] arr, int key) {
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid] == key)
				return mid;

			if (arr[mid] < key)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return -1;
	}

	/**
	 * Purpose: method for String binary search
	 * 
	 * Identifier: P4CallUtility
	 * 
	 * @param arr input from user
	 * @param key input from user
	 * @return returns index of key searched else returns -1
	 */
	public static int stringBinarySearch(String[] arr, String key) {
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid].equals(key))
				return mid;

			if (arr[mid].compareTo(key) > 0)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return -1;
	}

	/**
	 * Purpose: method for insertion sort
	 * 
	 * Identifier: P4CallUtility, P7InsertionSort
	 * 
	 * @param arr array from user
	 * @return returns sorted array
	 */
	public static int[] intInsertionSort(int[] arr) {
		/*
		 * 12, 11, 13, 5, 6
		 * 
		 * 11, 12, 13, 5, 6
		 * 
		 * 11, 12, 13, 5, 6
		 * 
		 * 5, 11, 12, 13, 6
		 */

		int key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	/**
	 * Purpose: method for insertion sort of String
	 * 
	 * Identifier: P4CallUtility
	 * 
	 * @param arr array from user
	 * @return returns sorted array
	 */
	public static String[] stringInsertionSort(String[] arr) {
		String key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	/**
	 * Purpose: method for bubble sort
	 * 
	 * Identifier: P4CallUtility, P8BubbleSort
	 * 
	 * @param arr array from user
	 * @return returns sorted array
	 */
	public static int[] intBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;

	}

	/**
	 * Purpose: method for string bubble sort
	 * 
	 * Identifier: P4CallUtility
	 * 
	 * @param arr array from user
	 * @return returns the sorted array
	 */
	public static String[] stringBubbleSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * Purpose: to finding magic number
	 * 
	 * Identifier: P5MagicNumber
	 * 
	 * @param range command line args taken
	 */
	public static void magicNumber(int range) {
		Scanner scanner = new Scanner(System.in);
		int li = 0;
		int hi = range - 1;
		int mi = (li + hi) / 2;

		System.out.println();
		System.out.println("Think of a number in your mind between 0 to " + (range - 1));

		while (li < hi) {
			System.out.println("if your number is between " + li + " to " + mi + " Press 1 ");
			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

			int uservalue = scanner.nextInt();
			if (uservalue == 1) {

				hi = mi;
				mi = (li + hi) / 2;

			} else if (uservalue == 2) {
				li = mi + 1;
				mi = (li + hi) / 2;
			} else {
				System.out.println("Wrong input ");
			}
		}

		System.out.println("Your number is :" + mi);
		scanner.close();

	}

	/**
	 * Purpose: method for printing integer array
	 * 
	 * @param arr array from user
	 */
	public static void printIntArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Purpose: method for printing String array
	 * 
	 * @param arr array from user
	 */
	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Purpose: method for calculating elapsedTime
	 * 
	 * Identifier: P4CallUtility
	 * 
	 * @return system current time in millis
	 */
	public long elapsedTime() {
		long now = System.currentTimeMillis();
		return now;
	}

	/**
	 * Purpose: method for taking information from file
	 * 
	 * @param path directory path given by program
	 * @return String of information which is there in file
	 */
	public static String getFromFile(String path) {
		BufferedReader bufferedReader = null;
		String str = "";
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			str = bufferedReader.readLine();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * Purpose: method for calculating notes
	 * 
	 * @param money
	 * @param notes
	 */
	public static void vendingMachine(int money, int[] notes) {
		// 1000, 500, 100, 50, 10, 5, 2, 1
		// 6221
		int i = 0, rem;
		while (money > 0) {
			if (money >= notes[i]) {
				int calcNotes = money / notes[i];// 2
				rem = money % notes[i];// 21
				money = rem;
				System.out.println(notes[i] + " Notes ---> " + calcNotes);
			}
			i++;
		}

	}

	/**
	 * Purpose: method for finding year is leap or not
	 * 
	 * Identifier:
	 * 
	 * @param year input taken from user
	 * @return
	 */

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Purpose: To Calculate Day Of a Week
	 * 
	 * @param day   input taken from user
	 * @param month input taken from user
	 * @param year  input taken from user
	 * @return dayOfWeek return day for week like Monday Tuesday
	 */
	public int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	/**
	 * Purpose: Method is written for Converting Temperature Fahrenheit to Celsius
	 * 
	 * @param temperatureInFerenheit
	 * @return temperatureInCelcius return temperature in celsius
	 */
	public double FahrenheitToCelsius(double temperatureInFerenheit) {
		double temperatureInCelcius;
		temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
		return temperatureInCelcius;
	}

	/**
	 * Purpose: Method is written for Converting Temperature Celcius to Fahrenheit
	 * 
	 * 
	 * @param temperatureInCelsius
	 * @return temperatureInFahrenheit return temperature in fahrenheit
	 */
	public double CelsiusToFahrenheit(double temperatureInCelsius) {
		double temperatureInFahrenheit;
		temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
		return temperatureInFahrenheit;
	}

	/**
	 * Purpose: This method will calculate the EMI for the month on the basis of
	 * 			loan amount for particular year and it will be depend upon the rate of
	 * 			interest given for the loan.
	 * 
	 * @param principalLoanAmount input taken for principal amount of loan
	 * @param year                input taken for how much year of loan
	 * @param rOI                 input taken for interest for the loan
	 * @return paymentAmountForMonth
	 * 
	 *         in this it calculating the amount to pay for every month
	 */
	public double LoanCalculator(int principalLoanAmount, int year, double rOI) {

		double payment, r;
		int n;
		n = 12 * year;
		r = (rOI / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}

	/**
	 * Purpose: method for finding square root using newton's law
	 * 
	 * @param c input from user
	 * @return returns the square root
	 */
	public double findSquareRootUsingNewtonsMethod(int c) {
		double t, epsilon;
		t = c;

		epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}

	/**
	 * Purpose: adding extra bit into binary number and swap from middle
	 * 
	 * @param decToBinary decimal number input from program
	 * @return returns swap binary numbers
	 */
	public int SwapNibbles(int decToBinary) {
		return (((decToBinary & 0x0F) << 4) | ((decToBinary & 0xF0) >> 4));

	}

	/**
	 * Purpose: merge sort method for dividing
	 * 
	 * @param arr   input from user
	 * @param start start index of array
	 * @param end   end index of array
	 */
	public void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}

	}

	/**
	 * Purpose: method for compare the value and conquer the array
	 * 
	 * @param arr   input from mergeSort method
	 * @param start input from mergeSort method
	 * @param mid   input from mergeSort method
	 * @param end   input from mergeSort method
	 */
	private void merge(String[] arr, int start, int mid, int end) {
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}

	}

}
