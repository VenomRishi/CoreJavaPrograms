/******************************************************************************
 *  Purpose: Program is for unordered list is implemented using linked list.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.handler.*;
import com.bridgelabz.utility.DataStructureUtility;

public class UnOrderedList {

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		try {
			strArray = utility.readFile(
					"/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/files/names")
					.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}
		System.out.println(list.show());

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());

		try {
			utility.writeFile(
					"/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/files/namesoutput",
					list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
