/******************************************************************************
 *  Purpose: Program is written for shuffle and distribute card of deck using 
 *  		 queue
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.util.Arrays;

import com.bridgelabz.handler.QueueImplementedUsingLinkedList;
import com.bridgelabz.utility.OOPsUtility;

public class CardOfDecksQueueSorted {

	public static void main(String[] args) {
		String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardNumb = { "201", "302", "403", "504", "605", "706", "807", "908", "1009", "Jack10", "Queen11",
				"King12", "Ace13" };
		String[] cardDeck = new String[52];
		QueueImplementedUsingLinkedList<String> queue = new QueueImplementedUsingLinkedList<String>();
		int j2 = 0;
		for (int i = 0; i < cardType.length; i++) {
			for (int j = 0; j < cardNumb.length; j++) {
				cardDeck[j2] = cardType[i] + " " + cardNumb[j];
				j2++;
			}
		}

		cardDeck = OOPsUtility.shuffleCardsDeck(cardDeck);
//		 System.out.println(Arrays.toString(cardDeck));
		String[] arr = new String[9];
		char[] last1 = new char[2];
		char[] last2 = new char[2];
		j2 = 0;
		String temp1, temp2, temp3, temp4;
		for (int p = 0; p < 4; p++) {
			for (int j = 0; j < 9; j++) {
				arr[j] = cardDeck[j2];
				j2++;

			}
//			System.out.println(Arrays.toString(arr));
//			System.out.println();
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {
					temp1 = arr[j];
					temp2 = arr[j + 1];

					last1[0] = temp1.charAt(temp1.length() - 2);
					last1[1] = temp1.charAt(temp1.length() - 1);
					last2[0] = temp2.charAt(temp2.length() - 2);
					last2[1] = temp2.charAt(temp2.length() - 1);
					if (Arrays.compare(last1, last2) > 0) {
						temp3 = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp3;

					}

				}

			}
//			System.out.println(Arrays.toString(arr));
//			System.out.println();
			queue.enQueue("For Player " + p + " : \n");
			for (int j = 0; j < 9; j++) {
				temp4 = arr[j].substring(0, arr[j].length() - 2);
				// System.out.print(temp4+"-->");
				queue.enQueue(temp4 + "-->");
			}
			// System.out.println();
			queue.enQueue("\n");
		}
		// printing the queue
		System.out.println(queue.showQueueWithoutSpace());

	}

}
