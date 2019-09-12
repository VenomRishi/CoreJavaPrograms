/**
 * Purpose: Stack class implemented for stack functionality
 * 
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 * @param <T> generic type class
 */

package com.bridgelabz.Handler;

public class Stack<T> {
	Object[] stack = new Object[6];
	int top;

	/**
	 * Purpose: push the element into stack
	 * 
	 * @param data push data into stack
	 */
	public void push(T data) {
		if (isFull()) {
			System.out.println("Stack is overflow");
		} else {
			stack[top] = data;
			top++;
		}

	}

	/**
	 * Purpose: pop the element from stack
	 * 
	 * @return returns data which is popped
	 */
	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			top--;
			stack[top] = 0;

		}

	}

	/**
	 * Purpose: show top element of stack
	 * 
	 * @return returns top data
	 */
	@SuppressWarnings("unchecked")
	public T peek() {
		T data;
		data = (T) stack[top - 1];
		return data;
	}

	/**
	 * Purpose: check stack is empty or not
	 * 
	 * @return return true if empty else true
	 */
	public boolean isEmpty() {

		return top == 0;
	}

	/**
	 * Purpose: check stack is full or not
	 * 
	 * @return return true if full else true
	 */
	public boolean isFull() {

		return top == stack.length;
	}

	/**
	 * Purpose: show stack values
	 */
	public void show() {
		for (Object num : stack) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * Purpose: check size of stack
	 * 
	 * @return return the top value
	 */
	public int size() {
		return top;
	}
}