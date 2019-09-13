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
		String revRear="";
		Deque<Character> deque = new Deque<Character>(str.length());

		for (int i = 0; i < str.length(); i++) {
			deque.insertRear(str.charAt(i));
		}

//		System.out.println(deque.getFront());
//		deque.deleteFront();
//		System.out.println(deque.getFront());
//		deque.deleteFront();
//		System.out.println(deque.getFront());
//		deque.deleteFront();
//		System.out.println(deque.getFront());
//		deque.deleteFront();
//		System.out.println(deque.getFront());
//		deque.deleteFront();

		for (int i = 0; i < str.length(); i++) {
			revFront += deque.getFront();
			deque.deleteFront();
		}
		for (int i = 0; i < str.length(); i++) {
			deque.insertRear(str.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			revRear += deque.getRear();
			deque.deleteRear();
		}
		System.out.println("Front delete : "+revFront);
		System.out.println("Rear delete : "+revRear);
//		for (int i = 0; i < str.length(); i++) {
//			deque.insertRear(str.charAt(i));
//		}
//		for (int i = 0; i < str.length(); i++) {
//			revRear += deque.getRear();
//			deque.deleteRear();
//		}
//		
		if(revFront.equals(revRear)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}


	}

}
