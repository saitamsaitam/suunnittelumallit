package composite;

import java.util.ArrayList;
import java.util.List;

import computerParts.*;

public class Computer implements Parts{
	
	private List<Parts> computer = new ArrayList<Parts>();
	
	public double price;
	
	public Case c;
	public GraphicsCard gp;
	public Memory m;
	public Motherboard mb;
	public Nic nic;
	public Processor proc;
	

	@Override
	public double getPrice() {
		System.out.println("Computer parts are:");
		for(Parts p : computer) {
			price = price + p.getPrice();
			System.out.println(""+p.toString() + "hinta: "+p.getPrice() + "€");
		}
		System.out.print("\nKokonaishinta on ");
		return price;
	}
	
	public void addPart(Parts p) {
		this.computer.add(p);
	}
	
	public void remove(Parts p) {
		computer.remove(p);
	}
	
	public void removeAll(Parts p) {
		System.out.println("Removing all parts from the computer");
		this.computer.clear();
	}
	
	
}
