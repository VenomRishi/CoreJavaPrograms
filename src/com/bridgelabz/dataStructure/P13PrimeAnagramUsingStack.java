/******************************************************************************
 *  Purpose: Program is written for finding prime anagram number between\
 *  		 given range and put this prime numbers into Stack
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.dataStructure;

import com.bridgelabz.Handler.StackImplementUsingLinkedList;
import com.bridgelabz.utility.DataStructureUtility;

public class P13PrimeAnagramUsingStack {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		StackImplementUsingLinkedList<Integer> stack = new StackImplementUsingLinkedList<Integer>();

		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (DataStructureUtility.isPrime(j)) {
					for (int k = j + 1; k < end; k++) {
						if (DataStructureUtility.isPrime(k)) {
							if (DataStructureUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
								stack.push(j);
								stack.push(k);

							}
						}
					}

				}
			}
			start = end + 1;
			end += 100;
		}
		//stack.show();
		
		int tempSize=stack.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(stack.peek()+" ");
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		

	}

}
