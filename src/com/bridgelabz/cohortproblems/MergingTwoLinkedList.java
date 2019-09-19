/******************************************************************************
 *  Purpose: Cohort Program about finding solution to problem (problem is
 *  		 documented into class only)
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   18-09-2019
 *  @week	 2
 *
 ******************************************************************************/

package com.bridgelabz.cohortproblems;

import com.bridgelabz.handler.LinkedList;

public class MergingTwoLinkedList {

	public static void main(String[] args) {
		/**
		 * Purpose: merging the number of two linkedlist
		 * 
		 * example:
		 * 
		 * list1 --> 1,2,3
		 * 
		 * list2 --> 4,5,6,7
		 * 
		 * list3 --> 1,4,2,5,3,6,7
		 */
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6, 7, 8 };
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			list2.add(arr2[i]);
		}
		int arr1size = arr1.length;
		int arr2size = arr2.length;
		int total = arr1size + arr2size;
		int temp1 = 0;
		int temp2 = 0;
		boolean flag = false;

		while (total != 0) {
			if (!flag) {
				if (list1.get(temp1) != null) {
					// System.out.println(list1.get(temp1));
					list3.add(list1.get(temp1));
					total--;
				}
				temp1++;
				flag = true;
			} else {
				if (list2.get(temp2) != null) {
					// System.out.println(list2.get(temp2));
					list3.add(list2.get(temp2));
					total--;
				}
				temp2++;
				flag = false;
			}

		}
		list3.show();
	}

}
