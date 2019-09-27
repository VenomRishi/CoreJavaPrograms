/******************************************************************************
 *  Purpose: Program is written for Stock account maintain using LinkedList
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.addressbook.repository.JsonUtil;
import com.bridgelabz.handler.LinkedList;
import com.bridgelabz.model.Companyshares;
import com.bridgelabz.model.CompanysharesModel;
import com.bridgelabz.utility.OOPsUtility;

public class StockAccountUsingLinkedListCompanyShares {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		CompanysharesModel compModel = new CompanysharesModel();

		// paths of files
		String pathOfCompanyShares = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/company_shares.json";

		// code for fetching json data and put it into models
		File file = new File(pathOfCompanyShares);
		// code for fetching the company shares
		if (file.length() != 0) {
			compModel = (CompanysharesModel) JsonUtil.readMapper(pathOfCompanyShares, compModel);
		}

		LinkedList<Companyshares> compList = new LinkedList<>();

		compList.addAll(compModel.getCompanyshares());
		boolean isExit = false;
		System.out.println("Please enter password to access company data");
		if (OOPsUtility.stringScanner().equals("admin")) {
			while (!isExit) {
				System.out.println("Enter company symbol: ");
				int companySymbol = OOPsUtility.integerScanner();
				int indexOfCompany = 0;
				boolean isCompanyFound = false;
				for (int i = 0; i < compList.size(); i++) {
					if (companySymbol == compList.get(i).getCompany_symbol()) {
						isCompanyFound = true;
						indexOfCompany = i;
						break;
					}
				}
				if (isCompanyFound) {

					System.out
							.println("The company you selected is: " + compList.get(indexOfCompany).getCompany_name());
					System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
					System.out.println("Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
					System.out.println("Company Total value: " + compList.get(indexOfCompany).getCompany_total_value());
					System.out.println("Welcome please select task: ");
					System.out.println("1. for adding shares\n2. for removing shares\n3. for exit");
					int sharesAmount;
					switch (OOPsUtility.integerScanner()) {
					case 1:
						// for adding shares
						System.out.println("Enter number of shares");
						sharesAmount = OOPsUtility.integerScanner();
						compList.get(indexOfCompany)
								.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() + sharesAmount);
						compList.get(indexOfCompany)
								.setCompany_total_value(compList.get(indexOfCompany).getCompany_shares()
										* compList.get(indexOfCompany).getCompany_share_price());
						System.out.println("Data saved!!!");
						System.out.println("Company: " + compList.get(indexOfCompany).getCompany_name());
						System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
						System.out.println(
								"Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
						System.out.println(
								"Company Total value: " + compList.get(indexOfCompany).getCompany_total_value());

						JsonUtil.readMapper(pathOfCompanyShares, compModel);
						break;
					case 2:
						// for removing shares
						System.out.println("Enter number of shares to remove");
						sharesAmount = OOPsUtility.integerScanner();
						// check whether company have greater shares than sharesto remove
						if (compList.get(indexOfCompany).getCompany_shares() > sharesAmount) {
							compList.get(indexOfCompany)
									.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() - sharesAmount);
							compList.get(indexOfCompany)
									.setCompany_total_value(compList.get(indexOfCompany).getCompany_shares()
											* compList.get(indexOfCompany).getCompany_share_price());

							System.out.println("Data saved!!!");
							System.out.println("Company: " + compList.get(indexOfCompany).getCompany_name());
							System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
							System.out.println(
									"Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
							System.out.println(
									"Company Total value: " + compList.get(indexOfCompany).getCompany_total_value());
							JsonUtil.readMapper(pathOfCompanyShares, compModel);
						} else
							System.out.println("Company don't have that much shares to remove");

						break;
					case 3:
						isExit = true;
						System.out.println("Thank you for your time");
						break;
					default:
						System.out.println("Invalid Option");
						break;

					}
				} else
					System.out.println("Company not found");
			}

		} else
			System.out.println("Invalid password");

	}

}
