package ingredients;

import decorator.Pizza;
import decorator.ToppingDecorator;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Moz");
		
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Mozzarella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.50;
	}
	
	
}
