/**
 * Purpose: Queue class implemented for Queue functionality using linked list
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-09-2019
 *
 * @param <T> generic type class
 */

package com.bridgelabz.handler;

import java.util.List;

public class QueueUsingLL<T> {
	LinkedList<T> queue = new LinkedList<T>();
	int size = 0;

	/**
	 * Purpose: enqueue data into linked list of queue
	 * 
	 * @param data input from user
	 */
	public void enQueue(Object data) {
		queue.add(data);
		size++;
	}

	/**
	 * Purpose: enqueue all data into linked list of queue
	 * 
	 * @param list data is given in list
	 */
	public void enQueueAll(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			enQueue(list.get(i));
		}
	}

	/**
	 * Purpose: dequeue element from the linked list of queue
	 */
	public void deQueue() {
		if (!isEmpty()) {
			queue.deleteAtStart();
			size--;
		}

	}

	/**
	 * Purpose: getting the value of index in queue
	 * 
	 * @param index input from user
	 * @return return the data of particular index
	 */
	public T get(int index) {
		if (index < size) {
			return queue.get(index);
		} else {
			return null;
		}
	}
	
	public T get() {
		T data=queue.get(size-1);
		return data;
	}

	/**
	 * Purpose: getting size of queue
	 * 
	 * @return returns the size of queue
	 */
	public int size() {
		return size;
	}

	/**
	 * Purpose: checking whether queue is empty or not
	 * 
	 * @return returns true if queue is empty else returns false
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String show() {
		return queue.show();
	}

}
