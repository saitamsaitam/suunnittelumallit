package computerParts;

import composite.Parts;

public class Processor implements Parts {
	
	public double price;

	public Processor(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Processor";
	}

}
