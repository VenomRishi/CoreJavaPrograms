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

	public AlgorithmUtility() {
		start = System.currentTimeMillis();
	}

	/**
	 * Purpose: method for finding two string are anagram or not
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
	 * @param num input from user
	 * @return returns true if prime else not prime
	 */
	public boolean isPrime(int num) {
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
	 * Purpose: method for int binary search
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
	 * @param arr
	 * @return
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
	 * Purpose: String bubble sort
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

	public void printIntArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/**
	 * @return
	 */
	public long elapsedTime() {
		long now = System.currentTimeMillis();
		return now;
	}
	

	/**
	 * @param path
	 * @return
	 */
	public static String getFromFile(String path) {
		BufferedReader bufferedReader = null;
		String str = "";
		try {
			bufferedReader = new BufferedReader(
					new FileReader(path));
			str = bufferedReader.readLine();
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

}
