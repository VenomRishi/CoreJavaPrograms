/******************************************************************************
 *  Purpose: This is utility class which will have the method of Stock 
 *  		 account class this class only holds the business logic of program.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   20-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.TransactionModel;
import com.bridgelabz.repository.JsonUtil;

public class StockAccountUtility {

	/**
	 * Purpose: this method will read the customer accounts and returns all accounts
	 * 
	 * @param fileName this is path of file is provided by user
	 * @return returns the object of mapped class
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static Object stockAccount(String fileName, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		return JsonUtil.readMapper(fileName, object.getClass());
	}

	/**
	 * Purpose: this method will calculate total value of shares
	 * 
	 * @return returns the total value of shares
	 */
	public static double valueOf() {
		return 0;

	}

	/**
	 * Purpose: this method is used to buy shares
	 * @param companySymbol 
	 * @param customerId 
	 * @param model 
	 * @param numOfCompanyShareToBuy 
	 * @return 
	 */
	public static Object buyShare(TransactionModel model, int customerId, int companySymbol,
			int numOfCompanyShareToBuy) {

		
		
		return model;
	}	

	/**
	 * Purpose: this method is used to sell shares
	 */
	public static void sellShare() {

	}

	/**
	 * @param filename file path where we are going to save json
	 * @param object   object is used to maps the json
	 * @return returns success if all operation performs well
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static String save(String filename, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		JsonUtil.writeMapper(filename, object);
		return "Saving successful";
	}

}
