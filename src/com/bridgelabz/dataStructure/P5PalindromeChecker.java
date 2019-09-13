/******************************************************************************
 *  Purpose: Program is for palindrome checker implemented using deque
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.dataStructure;

import com.bridgelabz.Handler.Deque;

public class P5PalindromeChecker {

	public static void main(String[] args) {
		String str = "madam";
		String revFront = "";
		String revRear = "";
		Deque<Character> deque = new Deque<Character>(str.length());
		// inserting element in deque
		for (int i = 0; i < str.length(); i++) {
			deque.insertRear(str.charAt(i));
		}

		// removing element from front and getting the front values
		for (int i = 0; i < str.length(); i++) {
			revFront += deque.getFront();
			deque.deleteFront();
		}

		// inserting element again in deque
		for (int i = 0; i < str.length(); i++) {
			deque.insertRear(str.charAt(i));
		}

		// removing element from rear and getting the rear values
		for (int i = 0; i < str.length(); i++) {
			revRear += deque.getRear();
			deque.deleteRear();
		}
		System.out.println("Front delete : " + revFront);
		System.out.println("Rear delete : " + revRear);

		if (revFront.equals(revRear)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
