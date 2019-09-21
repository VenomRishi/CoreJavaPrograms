/******************************************************************************
 *  Purpose: Program is for ordered list is implemented using linked list.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.handler.LinkedList;
import com.bridgelabz.utility.DataStructureUtility;

public class OrderedList {

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] strArr = null;

		try {
			strArr = (utility.readFile(
					"/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/files/numbers")
					.split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] integerArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			integerArr[i] = Integer.parseInt(strArr[i]);
			list.add(integerArr[i]);
		}
		int size = integerArr.length;
		System.out.println(list.show());
		System.out.println("\nSorting");
		list.sort(size);
		System.out.println(list.show());
		
		System.out.println("\nEnter key to search in list:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		size = list.searchNode(key, size);
		
		
		
		scanner.close();
		
		System.out.println("\nSorting");
		list.sort(size);

		System.out.println(list.show());
		String str = list.returnListInString();
		try {
			utility.writeFile(
					"/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/files/numbersoutput",
					str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
