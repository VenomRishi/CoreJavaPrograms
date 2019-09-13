/**
 * Purpose: Deque class implemented for deque functionality
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   13-09-2019
 *
 * @param <T> generic type class
 */

package com.bridgelabz.Handler;

/**
 * Operations on Deque:
 * 
 * void insertfront(int key);
 * 
 * void insertrear(int key);
 * 
 * void deletefront();
 * 
 * void deleterear();
 * 
 * bool isFull();
 * 
 * bool isEmpty();
 * 
 * T getFront();
 * 
 * T getRear();
 */
public class Deque<T> {
	Object[] deque;
	int front;
	int rear;
	int size;

	public Deque(int size) {
		deque = new Object[size];
		front = -1;
		rear = 0;
		this.size = size;
	}

	public void insertFront(T data) {
		// check whether Deque if full or not
		if (isFull()) {
			System.out.println("Overflow");
			return;
		} else {
			// If queue is initially empty
			if (front == -1) {
				front = 0;
				rear = 0;
			} else if (front == 0)
				front = size - 1;
			else
				front = front - 1;

			deque[front] = data;

		}

	}

	public void insertRear(T data) {
		if (isFull()) {
			System.out.println(" Overflow ");
			return;
		} else {
			if (front == -1) {
				front = 0;
				rear = 0;
			} else if (rear == size - 1)
				rear = 0;
			else
				rear = rear + 1;

			deque[rear] = data;
		}
		// insert current element into Deque
	}

	public void deleteFront() {
		// check whether Deque is empty or not
		if (isEmpty()) {
			System.out.println("Queue Underflow\n");
			return;
		} else {
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				if (front == size - 1)
					front = 0;
				else
					front = front + 1;
			}
			// deque[front] = 0;
		}

	}

	public void deleteRear() {
		if (isEmpty()) {
			System.out.println(" Underflow");
			return;
		} else {
			if (front == rear) {
				front = -1;
				rear = -1;
			} else if (rear == 0)
				rear = size - 1;
			else
				rear = rear - 1;
		}

	}

	// checked
	public boolean isFull() {
		return ((front == 0 && rear == size - 1) || front == rear + 1);
	}

	// checked
	public boolean isEmpty() {
		if (rear == 0)
			return true;
		else if (front == -1)
			return true;
		return false;
	}

	// Returns front element of Deque
	@SuppressWarnings("unchecked")
	public T getFront() {
		// check whether Deque is empty or not
		if (isEmpty()) {
			System.out.println(" Underflow");

		}
		return (T) deque[front];
	}

	// function return rear element of Deque
	@SuppressWarnings("unchecked")
	public T getRear() {
		// check whether Deque is empty or not
		if (isEmpty() || rear < 0) {
			System.out.println(" Underflow\n");
		}
		return (T) deque[rear];
	}
}
