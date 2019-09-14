package com.bridgelabz.Handler;

public class StackImplementUsingLinkedList<T> {
	LinkedList<T> stack = new LinkedList<T>();
	int top;

	/**
	 * Purpose: push the element into stack
	 * 
	 * @param data push data into stack
	 */
	public void push(T data) {

		stack.add(data);
		top++;

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
			stack.deleteAt(top);

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
		data = (T) stack.get(top);
		return data;
	}

	/**
	 * Purpose: check stack is empty or not
	 * 
	 * @return return true if empty else true
	 */
	public boolean isEmpty() {

		return stack.isEmpty();
	}

	/**
	 * Purpose: check stack is full or not
	 * 
	 * @return return true if full else true
	 */
//	public boolean isFull() {
//
//		return top == stack.length;
//	}

	/**
	 * Purpose: show stack values
	 */
	public void show() {
//		for (Object num : stack) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
		stack.show();
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
