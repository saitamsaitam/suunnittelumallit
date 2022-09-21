package computerParts;

import composite.Parts;

public class GraphicsCard implements Parts {

	public double price;
	
	public GraphicsCard(double p) {
		this.price = p;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Graphics card";
	}

}
