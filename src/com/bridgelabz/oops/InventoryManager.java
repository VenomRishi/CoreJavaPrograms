package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryDetailModel;
import com.bridgelabz.model.Pulses;
import com.bridgelabz.model.Rice;
import com.bridgelabz.model.Wheats;
import com.bridgelabz.utility.OOPsUtility;

public class InventoryManager {

	public static void main(String[] args) {
		System.out.println("Hello Manager");
		System.out.println("Lets Add some inventory");
		System.out.println("How much inventory you want to add");
		String path = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/inventory.json";
		String oldFilePath = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/inventory_detailsOutput.json";
		int num = OOPsUtility.integerScanner();
		ObjectMapper mapper = new ObjectMapper();

		int choice;
		String name;
		int weight;
		int pricePerKg;
		int totalPriceOfWeight;
		InventoryDetailModel model = new InventoryDetailModel();

		try {

			model = mapper.readValue(new File(oldFilePath), InventoryDetailModel.class);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		ArrayList<Rice> riceList = new ArrayList<Rice>();
		ArrayList<Pulses> pulsesList = new ArrayList<Pulses>();
		ArrayList<Wheats> wheatsList = new ArrayList<Wheats>();
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
		model.setRice(riceList);
		model.setPulses(pulsesList);
		model.setWheats(wheatsList);
		try {
			mapper.writeValue(new File(path), model);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
