package computerParts;

import composite.Parts;

// Network interface controller
public class Nic implements Parts {
	
	public double price;

	public Nic(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Network interface controller";
	}

}
