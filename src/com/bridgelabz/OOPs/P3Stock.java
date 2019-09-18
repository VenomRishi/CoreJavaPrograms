/******************************************************************************
 *  Purpose: Program is written for Parsing json of stock
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.OOPs;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.Model.StockModel;
import com.bridgelabz.utility.OOPsUtility;

public class P3Stock {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/stock.json";
		String outputPath = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/stockOutput.json";

		ObjectMapper mapper = new ObjectMapper();

		StockModel data = mapper.readValue(new File(path), StockModel.class);
		
		int totalValueOfParle = OOPsUtility.calculateTotalValueOfStock(data.getParle().get(0).getNumber_of_shares(),
				data.getParle().get(0).getShare_price());
		System.out.println("Total value of Stock Parle -->" + totalValueOfParle);

		data.getParle().get(0).setTotalValueOfStock(totalValueOfParle);

		int totalValueOfMarie = OOPsUtility.calculateTotalValueOfStock(data.getMarie().get(0).getNumber_of_shares(),
				data.getMarie().get(0).getShare_price());
		System.out.println("Total value of Stock Marie -->" + totalValueOfMarie);
		data.getMarie().get(0).setTotalValueOfStock(totalValueOfMarie);

		int totalValueOfOreo = OOPsUtility.calculateTotalValueOfStock(data.getOreo().get(0).getNumber_of_shares(),
				data.getOreo().get(0).getShare_price());
		System.out.println("Total value of Stock Oreo -->" + totalValueOfOreo);
		data.getOreo().get(0).setTotalValueOfStock(totalValueOfOreo);

		int totalValueOfTiger = OOPsUtility.calculateTotalValueOfStock(data.getTiger().get(0).getNumber_of_shares(),
				data.getTiger().get(0).getShare_price());
		System.out.println("Total value of Stock Tiger -->" + totalValueOfTiger);
		data.getTiger().get(0).setTotalValueOfStock(totalValueOfTiger);

		int totalValueOfAllStock = totalValueOfParle + totalValueOfMarie + totalValueOfOreo + totalValueOfTiger;

		data.setTotalValueOfAllStock(totalValueOfAllStock);
		System.out.println("Total count of all stocks -->"+totalValueOfAllStock);

		// code for writing all details into new file
		mapper.writeValue(new File(outputPath), data);
		System.out.println("\nWrite into file is completed!!!");
	}

}
