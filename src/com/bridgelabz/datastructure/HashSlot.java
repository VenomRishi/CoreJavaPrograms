/******************************************************************************
 *  Purpose: Program is for Hashing function data will be store in hash table
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.handler.HashMap;
import com.bridgelabz.utility.DataStructureUtility;

public class HashSlot {
	static int[] arr;

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		String readMessage = "";
		try {
			readMessage = utility.readFile(
					"/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/files/hashlist");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] str = readMessage.split(",");
		arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Getting keys");
		for (int i = 0; i < arr.length; i++) {
			hashmap.add(arr[i], arr[i]);
		}
		hashmap.show();
		System.out.println("\nEnter key to search: ");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		if (hashmap.get(key) != null) {
			hashmap.remove(key);
		} else {
			hashmap.add(key, key);
		}
		scanner.close();
		hashmap.show();
		try {
			utility.writeFile(
					"/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/files/hashlistoutput",
					hashmap.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
