package com.bridgelabz.model;

import java.util.List;

public class InventoryDetailModel {
	private List<Wheats> Wheats;

	private List<Pulses> Pulses;

	private List<Rice> Rice;
	
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Wheats> getWheats() {
		return Wheats;
	}

	public void setWheats(List<Wheats> wheats) {
		Wheats = wheats;
	}

	public List<Pulses> getPulses() {
		return Pulses;
	}

	public void setPulses(List<Pulses> pulses) {
		Pulses = pulses;
	}

	public List<Rice> getRice() {
		return Rice;
	}

	public void setRice(List<Rice> rice) {
		Rice = rice;
	}

}
