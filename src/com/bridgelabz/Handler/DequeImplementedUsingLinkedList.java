package com.bridgelabz.Handler;

public class DequeImplementedUsingLinkedList<T> {
	LinkedList<T> deque = new LinkedList<T>();
	int front = 0;
	int rear = 0;

	public void insertFront(T data) {
		deque.addAtStart(data);
		front++;
	}

	public void insertRear(T data) {
		deque.add(data);
		rear++;
	}

	public void removeFront() {
		deque.deleteAtStart();
		front--;
	}

	public void removeRear() {
		rear--;
		deque.deleteAt(rear);
	}

	public T getFront() {
		return deque.get(--front);
	}

	public T getRear() {
		return deque.get(rear);
	}

}
