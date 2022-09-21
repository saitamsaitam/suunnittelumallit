package computerParts;

import composite.Parts;

public class Fan implements Parts {
	
	public double price;

	public Fan(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Fan";
	}

}
