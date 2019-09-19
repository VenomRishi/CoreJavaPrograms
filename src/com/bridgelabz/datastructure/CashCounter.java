/******************************************************************************
 *  Purpose: Program is for cash counter implemented using queue
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.handler.QueueImplementedUsingLinkedList;

public class CashCounter {

	public static void main(String[] args) {
		QueueImplementedUsingLinkedList<Integer> queue = new QueueImplementedUsingLinkedList<Integer>();
		System.out.println("Enter people size");
		Scanner scanner = new Scanner(System.in);
		int people = scanner.nextInt();

		System.out.println("Hi! Welcome to bank simulation: ");
		for (int i = 0; i < people; i++) {

			queue.enQueue(i);
			queue.service();
			queue.deQueue();
		}
		if (queue.isEmpty()) {
			System.out.println("Queue is empty");
		}
		System.out.println("Bank Closing balance is : " + queue.bankBalance);
		scanner.close();
	}

}
