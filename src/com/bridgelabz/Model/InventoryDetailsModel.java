package com.bridgelabz.Model;

public class InventoryDetailsModel {
	private Wheats Wheats;

	private Pulses Pulses;

	private Rice Rice;

	public Wheats getWheats() {
		return Wheats;
	}

	public void setWheats(Wheats Wheats) {
		this.Wheats = Wheats;
	}

	public Pulses getPulses() {
		return Pulses;
	}

	public void setPulses(Pulses Pulses) {
		this.Pulses = Pulses;
	}

	public Rice getRice() {
		return Rice;
	}

	public void setRice(Rice Rice) {
		this.Rice = Rice;
	}

	@Override
	public String toString() {
		return "ClassPojo [Wheats = " + Wheats + ", Pulses = " + Pulses + ", Rice = " + Rice + "]";
	}

	public class Rice {
		private String price_per_kg;

		private String name;

		private String weight;

		public String getPrice_per_kg() {
			return price_per_kg;
		}

		public void setPrice_per_kg(String price_per_kg) {
			this.price_per_kg = price_per_kg;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "ClassPojo [price_per_kg = " + price_per_kg + ", name = " + name + ", weight = " + weight + "]";
		}
	}

	public class Pulses {
		private String price_per_kg;

		private String name;

		private String weight;

		public String getPrice_per_kg() {
			return price_per_kg;
		}

		public void setPrice_per_kg(String price_per_kg) {
			this.price_per_kg = price_per_kg;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "ClassPojo [price_per_kg = " + price_per_kg + ", name = " + name + ", weight = " + weight + "]";
		}
	}

	public class Wheats {
		private String price_per_kg;

		private String name;

		private String weight;

		public String getPrice_per_kg() {
			return price_per_kg;
		}

		public void setPrice_per_kg(String price_per_kg) {
			this.price_per_kg = price_per_kg;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "ClassPojo [price_per_kg = " + price_per_kg + ", name = " + name + ", weight = " + weight + "]";
		}
	}

}
