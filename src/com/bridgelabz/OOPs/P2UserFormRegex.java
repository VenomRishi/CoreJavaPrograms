package com.bridgelabz.OOPs;

import java.util.Scanner;

import com.bridgelabz.utility.OOPsUtility;

public class P2UserFormRegex {

	public static void main(String[] args) {
		OOPsUtility utility = new OOPsUtility();
		String fname, lname, email, phone, company, userid, password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter fname");
		fname = scanner.nextLine();
		if (utility.isValidName(fname)) {
			System.out.println("Enter lname");
			lname = scanner.nextLine();
			if (utility.isValidName(lname)) {
				System.out.println("Enter email");
				email = scanner.nextLine();
				if (utility.isValidEmail(email)) {
					System.out.println("Enter phone with coutry code");
					phone = scanner.nextLine();
					if (!phone.isEmpty()) {
						System.out.println(phone);
						if (utility.isValidMobile(phone)) {
							System.out.println("Enter company");
							company = scanner.nextLine();
							System.out.println("Enter userid");
							userid = scanner.nextLine();
							if (utility.isValidUsername(userid)) {
								System.out.println("Enter password");
								password = scanner.next();
								if (utility.isValidPassword(password)) {
									System.out.println("Thank you for your time");
									System.out.println("Form details is");
									System.out.println("Fname :" + fname);
									System.out.println("Lname :" + lname);
									System.out.println("Email :" + email);
									System.out.println("phone :" + phone);
									System.out.println("company :" + company);
									System.out.println("userid :" + userid);
									System.out.println("password :" + password);
								} else
									System.out.println("Enter valid password");
							} else
								System.out.println("Enter valid username");
						} else
							System.out.println("Please enter valid mobile");
					}
				} else
					System.out.println("Please enter valid email");

			} else
				System.out.println("Please enter valid lname");
		} else
			System.out.println("Please enter valid fname");
		scanner.close();

	}

}
