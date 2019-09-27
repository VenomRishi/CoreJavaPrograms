/******************************************************************************
 *  Purpose: Program is written for Parsing json of stock
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.StockModel;
import com.bridgelabz.utility.OOPsUtility;

public class Stock {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/stock.json";
		String outputPath = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/stockOutput.json";

		ObjectMapper mapper = new ObjectMapper();

		StockModel data = mapper.readValue(new File(path), StockModel.class);
		System.out.println("-----------------------------Stock Report--------------------------------");
		System.out.println("Stock Name: " + data.getParle().get(0).getStock_name());
		System.out.println("Stock Price: " + data.getParle().get(0).getShare_price());
		System.out.println("Stock Number of Shares: " + data.getParle().get(0).getNumber_of_shares());
		System.out.println();
		int totalValueOfParle = OOPsUtility.calculateTotalValueOfStock(data.getParle().get(0).getNumber_of_shares(),
				data.getParle().get(0).getShare_price());
		System.out.println("Total value of Stock Parle -->" + totalValueOfParle);

		data.getParle().get(0).setTotalValueOfStock(totalValueOfParle);

		System.out.println();
		System.out.println("Stock Name: " + data.getMarie().get(0).getStock_name());
		System.out.println("Stock Price: " + data.getMarie().get(0).getShare_price());
		System.out.println("Stock Number of Shares: " + data.getParle().get(0).getNumber_of_shares());
		System.out.println();
		int totalValueOfMarie = OOPsUtility.calculateTotalValueOfStock(data.getMarie().get(0).getNumber_of_shares(),
				data.getMarie().get(0).getShare_price());
		System.out.println("Total value of Stock Marie -->" + totalValueOfMarie);
		data.getMarie().get(0).setTotalValueOfStock(totalValueOfMarie);

		System.out.println();
		System.out.println("Stock Name: " + data.getOreo().get(0).getStock_name());
		System.out.println("Stock Price: " + data.getOreo().get(0).getShare_price());
		System.out.println("Stock Number of Shares: " + data.getOreo().get(0).getNumber_of_shares());
		System.out.println();
		int totalValueOfOreo = OOPsUtility.calculateTotalValueOfStock(data.getOreo().get(0).getNumber_of_shares(),
				data.getOreo().get(0).getShare_price());
		System.out.println("Total value of Stock Oreo -->" + totalValueOfOreo);
		data.getOreo().get(0).setTotalValueOfStock(totalValueOfOreo);

		System.out.println();
		System.out.println("Stock Name: " + data.getTiger().get(0).getStock_name());
		System.out.println("Stock Price: " + data.getTiger().get(0).getShare_price());
		System.out.println("Stock Number of Shares: " + data.getTiger().get(0).getNumber_of_shares());
		System.out.println();
		int totalValueOfTiger = OOPsUtility.calculateTotalValueOfStock(data.getTiger().get(0).getNumber_of_shares(),
				data.getTiger().get(0).getShare_price());
		System.out.println("Total value of Stock Tiger -->" + totalValueOfTiger);
		data.getTiger().get(0).setTotalValueOfStock(totalValueOfTiger);

		int totalValueOfAllStock = totalValueOfParle + totalValueOfMarie + totalValueOfOreo + totalValueOfTiger;

		data.setTotalValueOfAllStock(totalValueOfAllStock);
		System.out.println();
		System.out.println("Total count of all stocks -->" + totalValueOfAllStock);
		System.out.println();
		System.out.println("-----------------------------Stock Report--------------------------------");
		// code for writing all details into new file
		mapper.writeValue(new File(outputPath), data);
		System.out.println("\nWrite into file is completed!!!");
	}

}
