package com.bridgelabz.oops;

import java.util.Scanner;

import com.bridgelabz.utility.OOPsUtility;

public class MessageRegex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullname, num;
		String str = "Hello <<name>>, We have your full name\r\n"
				+ "as <<fullname>> in our system. your contact number is +91-­xxxxxxxxxx. Please,let us\r\n"
				+ "know in case of any clarification Thank you BridgeLabz Date.";
		System.out.println("Enter fullname");
		fullname = scanner.nextLine();
		System.out.println("Enter mobile");
		num = scanner.next();

		System.out.println(OOPsUtility.message(fullname, num, str));

		scanner.close();

	}

}
