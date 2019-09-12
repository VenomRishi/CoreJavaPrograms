/**
 * Purpose: Linked list class implemented to how the linked list functionality
 * 
 * @author Rishikesh Mhatre
 *
 * @param <T> generic type class
 */
package com.bridgelabz.Handler;

public class LinkedList<T> {
	Node<T> head;

	public void insert(T data) {
		Node<T> nodenew = new Node<T>();
		nodenew.data = data;
		if (head == null)
			head = nodenew;
		else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodenew;
		}
	}

	public void insertAtStart(T data) {
		Node<T> nodenew = new Node<T>();
		nodenew.data = data;
		nodenew.next = null;
		nodenew.next = head;
		head = nodenew;
	}

	public void insertAr(int index, T data) {
		Node<T> nodenew = new Node<T>();
		nodenew.data = data;
		if (index == 0)
			head = nodenew;
		else {
			Node<T> n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			nodenew.next = n.next;
			n.next = nodenew;
		}
	}

	public void deleteAtStart() {
		head = head.next;
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Node deleted is: " + n1.data);
			n1 = null;
		}

	}

	public void show() {
		Node<T> n = head;
		while (n.next != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println(n.data);
	}

	public String returnListInString() {
		String str = "";
		Node<T> n = head;
		while (n.next != null) {
			str += n.data + ",";
			n = n.next;
		}
		str += n.data;
		return str;
	}

	public int searchNode(T key, int size) {
		boolean isFound = false;
		int counter = -1;
		Node<T> n = head;
		while (n.next != null) {
			counter++;
			if (n.data.equals(key)) {
				isFound = true;
				break;
			}
			n = n.next;
		}
		if (isFound) {
			System.out.println("key found and deleting...");
			deleteAt(counter);
			size--;
		} else if (n.data.equals(key)) {
			System.out.println("key found at last and deleting...");
			counter++;
			deleteAt(counter);
			size--;
		} else {
			System.out.println("key not found and inserting...");
			size++;
			insert(key);
		}
		return size;
	}

	public void sort(int size) {
		Node<T> n = head;
		Node<T> n1 = n.next;
		T temp;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j <= size - 1 - i - 1; j++) {

				if ((int) n.data > (int) n1.data) {
					temp = n.data;
					n.data = n1.data;
					n1.data = temp;
				}
				n1 = n1.next;
			}
			n = n.next;
			n1 = n.next;
		}
	}

}
