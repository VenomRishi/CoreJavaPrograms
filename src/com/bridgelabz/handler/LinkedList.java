/**
 * Purpose: Linked list class implemented for linked list functionality
 *
 * @param <T> generic type class
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 */
package com.bridgelabz.handler;

import java.util.List;

public class LinkedList<T> {
	Node<T> head;
	public Object deleteAt;
	int size = 0;

	/**
	 * Purpose: method for insert node
	 * 
	 * @param data input from user
	 */
	@SuppressWarnings("unchecked")
	public void add(Object data) {
		Node<T> nodenew = new Node<T>();
		nodenew.data = (T) data;
		if (head == null) {
			head = nodenew;
			size++;
		}

		else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodenew;
			size++;
		}
	}

	/**
	 * Purpose: method for insert node at start
	 * 
	 * @param data input from user
	 */
	public void addAtStart(T data) {
		Node<T> nodenew = new Node<T>();
		nodenew.data = data;
		nodenew.next = null;
		nodenew.next = head;
		head = nodenew;
		size++;
	}

	/**
	 * Purpose: method for insert node at specific index
	 * 
	 * @param index input from user
	 * @param data  input from user
	 */
	public void addAt(int index, T data) {
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
		size++;
	}

	public T get(int index) {
		if (index == 0)
			return head.data;
		else {
			Node<T> n = head;
			for (int i = 0; i < index; i++) {
				if (n.next != null) {
					n = n.next;
				} else {
					return null;
				}

			}
//			n = n.next;
			return n.data;

		}

	}

	/**
	 * Purpose: method for delete node at start
	 */
	public void deleteAtStart() {
		head = head.next;
		size--;
	}

	/**
	 * Purpose: method for delete node at start
	 * 
	 * @param index input from user
	 */
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
//			System.out.println("Node deleted is: " + n1.data);
			n1 = null;
		}
		size--;

	}

	/**
	 * Purpose: method for deleting node at last index
	 */
	public void deleteAtEnd() {
		if (!isEmpty()) {
			Node<T> n = head;

			while (n.next != null) {
				n = n.next;
			}

			n.next = null;

		} else {
			System.out.println("Linked list is empty nothing to delete");
		}
		size--;
	}

	/**
	 * Purpose: method for display the nodes
	 */
	public String show() {
		String str = "";
		Node<T> n = head;
		if (head == null) {
			return "no data";
		} else {
			while (n.next != null) {
				str += n.data + " ";
				n = n.next;
			}
			str += n.data;
		}

		return str;
	}

	/**
	 * Purpose: printing the list without using spaces
	 */
	public String showListWithoutSpaces() {
		String str = "";
		Node<T> n = head;
		while (n.next != null) {
			str += n.data;
			n = n.next;
		}
		str += n.data;
		return str;
	}

	/**
	 * Purpose: method which convert list in string and return it
	 * 
	 * @return returns the list in string
	 */
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

	/**
	 * Purpose: method for search node from list
	 * 
	 * @param key  input from user
	 * @param size input from user
	 * @return updated size if delete then size-- else size++
	 */
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
			add(key);
		}
		return size;
	}

	/**
	 * Purpose: method for sort the integer list
	 * 
	 * @param size size of an array
	 */
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void sort(int size) {
		@SuppressWarnings("unchecked")
		Node<T> n = (Node<T>) head;
		Node<T> n1 = n.next;
		T temp;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j <= size - 1 - i - 1; j++) {

				if (n.data.compareTo(n1.data) > 0) {
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

	/**
	 * Purpose: method for checking list is empty or not
	 * 
	 * @return returns true if empty else returns false
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Purpose: method for getting the size of linked list
	 * 
	 * @return returns the size of linked list
	 */
	public int size() {
		return size;
	}

	/**
	 * Purpose: method to add all data into linked list
	 * 
	 * @param list data is provided in the form of list
	 */
	public void addAll(List<T> list) {

		for (int i = 0; i < list.size(); i++) {
			add(list.get(i));
		}

	}

}
