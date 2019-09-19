/**
 * Purpose: Queue class implemented for Queue functionality
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 * @param <T> generic type class
 */

package com.bridgelabz.handler;

import java.util.Scanner;

public class Queue<T> {
	Object[] queue = new Object[10];
	int front;
	int rear;
	int size;
	public int bankBalance = 500000;
	Scanner scanner = new Scanner(System.in);
	int counter=1;

	/**
	 * Purpose: method for enqueue the element
	 * 
	 * @param data	element which is to add
	 */
	public void enQueue(T data) {
		queue[rear] = data;
		rear = (rear + 1) % 5;
		size = size + 1;
		if (isFull()) {
			System.out.println("Queue is full removing first value");
		}
	}

	/**
	 * Purpose: method for dequeue the element
	 * 
	 * @return	returns the element which is deleted
	 */
	public T deQueue() {
		@SuppressWarnings("unchecked")
		T data = (T) queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size = size - 1;
		} else {
			System.out.println("Queue is empty nothing to delete");
		}

		return data;

	}

	/**
	 * Purpose: method for showing the whole queue
	 */
	public void show() {
		System.out.print("Element : ");
		int length = queue.length;
		int count = rear;
		if (isFull()) {
			while (length > 0) {
				System.out.print(queue[count] + " ");
				count++;
				if (count == 5) {
					count = 0;
				}
				length--;
			}
		} else {
			for (int i = 0; i < size; i++) {
				System.out.print(queue[(front + i) % 5] + " ");
			}
		}

	}

	/**
	 * Purpose: method for getting size of queue
	 * 
	 * @return		returns the size of queue
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Purpose: method for checking queue is empty
	 * 
	 * @return	returns true if empty else returns false
	 */
	public boolean isEmpty() {
		return getSize() == 0;
	}

	/**
	 * Purpose: method for checking queue is full
	 * 
	 * @return	returns true if full else returns false
	 */
	public boolean isFull() {
		return getSize() == 5;
	}

	/**
	 * Purpose: method for serving people who are in queue
	 */
	public void service() {

		System.out.println("Token number is : " + counter);
		
		int choice;
		int amount=0;
		System.out.println("press 1: for withdraw\npress 2: for deposit");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter amount to withdraw");
			amount = scanner.nextInt();
			bankBalance = bankBalance - amount;
			System.out.println("Thank you for using service");
			amount=0;
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			amount = scanner.nextInt();
			bankBalance = bankBalance + amount;
			System.out.println("Thank you for using service");
			amount=0;
			break;
		default:
			System.out.println("Enter valid option");
		}
		counter++;
		
	}

}