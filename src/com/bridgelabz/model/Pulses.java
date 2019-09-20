package com.bridgelabz.model;

public class Pulses {
	private int price_per_kg;
	private String name;
	private int weight;
	private int totalPriceOfWeight;

	public int getTotalPriceOfWeight() {
		return totalPriceOfWeight;
	}

	public void setTotalPriceOfWeight(int totalPriceOfWeight) {
		this.totalPriceOfWeight = totalPriceOfWeight;
	}

	public int getPrice_per_kg() {
		return price_per_kg;
	}

	public void setPrice_per_kg(int price_per_kg) {
		this.price_per_kg = price_per_kg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
