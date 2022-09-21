package computerParts;

import java.util.ArrayList;
import java.util.List;

import composite.Parts;

public class Motherboard implements Parts {
	
	private List<Parts> boardParts = new ArrayList<Parts>();
	
	public double boardPrice;

	public Motherboard(double p) {
		this.boardPrice = p;
		RAMSlots rs = new RAMSlots(30);
		boardParts.add(rs);
	}
	
	@Override
	public double getPrice() {
		double price = 0;
		
		for(Parts p : boardParts) {
			price = price + p.getPrice();
		}
		
		return boardPrice + price;
		
	}
	
	@Override
	public String toString() {
		return "Motherboard";
	}

}
