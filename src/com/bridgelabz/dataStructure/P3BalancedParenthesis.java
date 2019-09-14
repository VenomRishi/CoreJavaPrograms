/******************************************************************************
 *  Purpose: Program is for checking parenthesis of string is balanced or not
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.dataStructure;

import com.bridgelabz.Handler.StackImplementUsingLinkedList;

public class P3BalancedParenthesis {

	public static void main(String[] args) {
		String exp = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)))))";
		StackImplementUsingLinkedList<Character> stack = new StackImplementUsingLinkedList<Character>();
		boolean isBalanced = false;
		for (int i = 0; i < exp.length(); i++) {
			isBalanced=false;
			if (exp.charAt(i) == '(') {
				stack.push('(');
				// System.out.print("Peek : "+stack.peek());
			} else if (exp.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
					isBalanced = true;
				}
				

			}
		}
		if (stack.isEmpty() && isBalanced) {
			System.out.println("\nExpression has balanced Parenthesis");
		} else {
			System.out.println("\nExpression has not balanced Parenthesis");
		}

	}

}
