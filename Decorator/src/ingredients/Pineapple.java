package ingredients;

import decorator.Pizza;
import decorator.ToppingDecorator;

public class Pineapple extends ToppingDecorator {

	public Pineapple(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Pineapple");		
		
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Pineapple";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.45;
	}

}
