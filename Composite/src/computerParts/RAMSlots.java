package computerParts;

import composite.Parts;

public class RAMSlots implements Parts{

	public double price;
	
	public RAMSlots(double p) {
		this.price = p;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "RAM slots";
	}

}
