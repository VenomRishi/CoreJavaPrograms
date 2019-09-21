/******************************************************************************
 *  Purpose: Program is written for Stock account maintain using Queue
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.handler.QueueUsingLL;
import com.bridgelabz.helper.JsonUtil;
import com.bridgelabz.model.TransactionModel;
import com.bridgelabz.model.Transactions;
import com.bridgelabz.utility.OOPsUtility;

public class StockAccountUsingQueueTransactions {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String pathOfTransactions = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/transactions.json";

		TransactionModel model = new TransactionModel();

		model = (TransactionModel) JsonUtil.readMapper(pathOfTransactions, model);

		QueueUsingLL<Transactions> queue = new QueueUsingLL<Transactions>();

		queue.enQueueAll(model.getTransactions());

		System.out.println("Enter password");
		if (OOPsUtility.stringScanner().equals("admin")) {
			int size = queue.size();
			// System.out.println(size);
			System.out.println("Transactions time");
			for (int i = size - 1; i >= 0; i--) {
				System.out.println(queue.get(i).getDatetime());
				queue.deQueue();

			}
		} else
			System.out.println("Invalid password");
	}

}
