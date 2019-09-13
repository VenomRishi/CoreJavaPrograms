/******************************************************************************
 *  Purpose: Program is for Hashing function data will be store in hash table
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.dataStructure;

import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.Handler.HashMap;
import com.bridgelabz.utility.DataStructureUtility;

public class P6HashSlot {
	static int[] arr;
	public static int arrSize;

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
		arrSize=arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Getting keys");
		for (int i = 0; i < arr.length; i++) {
			hashmap.add(arr[i], arr[i]);
		}
		hashmap.show();

	}

	public static int hashFunction(int key) {
		return key % arr.length;
	}

}
