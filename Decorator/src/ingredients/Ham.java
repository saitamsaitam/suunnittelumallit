package ingredients;

import decorator.Pizza;
import decorator.ToppingDecorator;

public class Ham extends ToppingDecorator{

	public Ham(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Ham");		
		
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Ham";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.55;
	}
}
