/******************************************************************************
 *  Purpose: Program is written for finding prime anagram number between
 *  		 given range and put this prime numbers into Queue
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.handler.QueueImplementedUsingLinkedList;
import com.bridgelabz.utility.DataStructureUtility;

public class PrimeAnagramUsingQueue {

	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		QueueImplementedUsingLinkedList<Integer> queue = new QueueImplementedUsingLinkedList<Integer>();
		// putting values in array

		for (int j = start; j <= end; j++) {
			if (DataStructureUtility.isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (DataStructureUtility.isPrime(k)) {
						if (DataStructureUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
							queue.enQueue(j);
							queue.enQueue(k);

						}
					}
				}

			}

		}

		int tempSize = queue.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(queue.get(i) + " ");
//			if (queue.get(i) > 90 && queue.get(i) < 105)
//				System.out.println();
//			if (queue.get(i) > 190 && queue.get(i) < 205)
//				System.out.println();
//			if (queue.get(i) > 285 && queue.get(i) < 305)
//				System.out.println();
//			if (queue.get(i) > 390 && queue.get(i) < 405)
//				System.out.println();
//			if (queue.get(i) > 490 && queue.get(i) < 505)
//				System.out.println();
//			if (queue.get(i) > 690 && queue.get(i) < 705)
//				System.out.println();
//				queue.deQueue();

		}
	}

}
