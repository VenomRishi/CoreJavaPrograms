/******************************************************************************
 *  Purpose: Program is written for Parsing json of inventory details 
 *  		 and at the end writing new json file of new inventory details
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   20-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.helper.JsonUtil;
import com.bridgelabz.model.InventoryDetailModel;
import com.bridgelabz.model.Pulses;
import com.bridgelabz.model.Rice;
import com.bridgelabz.model.Wheats;
import com.bridgelabz.utility.OOPsUtility;

public class InventoryManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		System.out.print("Hello Manager!!!");
		System.out.println(" Lets Add some inventory");
		System.out.println("How much inventory you want to add");
		String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/inventory.json";
		String oldFilePath = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/inventory_detailsOutput.json";
		int num = OOPsUtility.integerScanner();

		int choice;
		String name;
		int weight;
		int pricePerKg;
		int totalPriceOfWeight;
		int inventoryGrandTotal = 0;
		InventoryDetailModel model = new InventoryDetailModel();

		model = (InventoryDetailModel) JsonUtil.readMapper(oldFilePath, model);

		ArrayList<Rice> riceList = new ArrayList<Rice>();
		ArrayList<Pulses> pulsesList = new ArrayList<Pulses>();
		ArrayList<Wheats> wheatsList = new ArrayList<Wheats>();
		model.getRice().get(0)
				.setTotalPriceOfWeight(model.getRice().get(0).getWeight() * model.getRice().get(0).getPrice_per_kg());
		model.getPulses().get(0).setTotalPriceOfWeight(
				model.getPulses().get(0).getWeight() * model.getPulses().get(0).getPrice_per_kg());
		model.getWheats().get(0).setTotalPriceOfWeight(
				model.getWheats().get(0).getWeight() * model.getWheats().get(0).getPrice_per_kg());
		int riceSize = model.getRice().size();
		int pulsesSize = model.getPulses().size();
		int wheatsSize = model.getWheats().size();
		for (int i = 0; i <= model.getRice().size() - 1; i++) {
			inventoryGrandTotal += model.getRice().get(riceSize - 1).getTotalPriceOfWeight();
			riceSize--;
		}
		for (int i = 0; i <= model.getPulses().size() - 1; i++) {
			inventoryGrandTotal += model.getPulses().get(pulsesSize - 1).getTotalPriceOfWeight();
			pulsesSize--;
		}
		for (int i = 0; i <= model.getPulses().size() - 1; i++) {
			inventoryGrandTotal += model.getWheats().get(wheatsSize - 1).getTotalPriceOfWeight();
			wheatsSize--;
		}
		riceList.addAll(model.getRice());
		pulsesList.addAll(model.getPulses());
		wheatsList.addAll(model.getWheats());

		for (int i = 0; i < num; i++) {
			System.out.println("For adding press \n1. for rice\n2. for pulses\n3. for wheats: ");
			choice = OOPsUtility.integerScanner();

			switch (choice) {
			case 1:
				Rice rice = new Rice();
				System.out.println("Enter name of brand: ");
				name = OOPsUtility.stringScanner();
				System.out.println("Enter weight: ");
				weight = OOPsUtility.integerScanner();
				System.out.println("Enter price per kg: ");
				pricePerKg = OOPsUtility.integerScanner();
				totalPriceOfWeight = weight * pricePerKg;

				inventoryGrandTotal += totalPriceOfWeight;

				rice.setName(name);
				rice.setWeight(weight);
				rice.setPrice_per_kg(pricePerKg);
				rice.setTotalPriceOfWeight(totalPriceOfWeight);

				riceList.add(rice);
				break;
			case 2:
				Pulses pulses = new Pulses();
				System.out.println("Enter name of brand: ");
				name = OOPsUtility.stringScanner();
				System.out.println("Enter weight: ");
				weight = OOPsUtility.integerScanner();
				System.out.println("Enter price per kg: ");
				pricePerKg = OOPsUtility.integerScanner();
				totalPriceOfWeight = weight * pricePerKg;

				inventoryGrandTotal += totalPriceOfWeight;

				pulses.setName(name);
				pulses.setWeight(weight);
				pulses.setPrice_per_kg(pricePerKg);
				pulses.setTotalPriceOfWeight(totalPriceOfWeight);

				pulsesList.add(pulses);

				break;
			case 3:
				Wheats wheats = new Wheats();
				System.out.println("Enter name of brand: ");
				name = OOPsUtility.stringScanner();
				System.out.println("Enter weight: ");
				weight = OOPsUtility.integerScanner();
				System.out.println("Enter price per kg: ");
				pricePerKg = OOPsUtility.integerScanner();
				totalPriceOfWeight = weight * pricePerKg;

				inventoryGrandTotal += totalPriceOfWeight;

				wheats.setName(name);
				wheats.setWeight(weight);
				wheats.setPrice_per_kg(pricePerKg);
				wheats.setTotalPriceOfWeight(totalPriceOfWeight);

				wheatsList.add(wheats);

				break;
			default:
				System.out.println("Please select valid option!!");
				continue;
			}

		}

		model.setTotal(inventoryGrandTotal);
		model.setRice(riceList);
		model.setPulses(pulsesList);
		model.setWheats(wheatsList);

		System.out.println(JsonUtil.writeMapper(path, model));
		System.out.println("Inventory is added into new json File");

	}

}
