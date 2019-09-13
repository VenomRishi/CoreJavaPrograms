/******************************************************************************
 *  Purpose: This is utility file which contains logic for files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class DataStructureUtility {

	/**
	 * Purpose: reading file and return in string
	 * 
	 * @param path	path of file
	 * @return	returns the string value which is read from file
	 * @throws IOException	checking exception for file operation
	 */
	public String readFile(String path) throws IOException {
		String str = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}

	/**
	 * Purpose: writing string into file
	 * 
	 * @param path	path of file	
	 * @param str	input from user end
	 * @throws IOException	checking exception for file operation
	 */
	public void writeFile(String path, String str) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(str);
		bufferedWriter.close();
		System.out.println("File is Written...");
	}

}
