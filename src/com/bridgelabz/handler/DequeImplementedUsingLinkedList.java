/**
 * Purpose: Deque class implemented for deque functionality using linked list
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-09-2019
 *
 * @param <T> generic type class
 */
package com.bridgelabz.handler;

public class DequeImplementedUsingLinkedList<T> {
	LinkedList<T> deque = new LinkedList<T>();
	int size=0;

	/**
	 * Purpose: insert data from front
	 * 
	 * @param data input from user
	 */
	public void insertFront(T data) {
		deque.addAtStart(data);
		size++;
	}

	/**
	 * Purpose: insert data from rear
	 * 
	 * @param data input from user
	 */
	public void insertRear(T data) {
		deque.add(data);
		size++;
	}

	/**
	 * Purpose: remove element from front
	 */
	public void removeFront() {
		deque.deleteAtStart();
		size--;
	}

	/**
	 * Purpose: remove element from rear
	 */
	public void removeRear() {
		deque.deleteAtEnd();
		size--;
	}

	/**
	 * Purpose: getting value from front
	 * 
	 * @return returns the value
	 */
	public T getFront() {
		return deque.get(--size);
	}

	/**
	 * Purpose: getting value from rear
	 * 
	 * @return returns the value
	 */
	public T getRear() {
		return deque.get(size-1);
	}

}
