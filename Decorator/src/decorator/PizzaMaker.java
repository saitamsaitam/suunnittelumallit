package decorator;

import ingredients.Ham;
import ingredients.Mozzarella;
import ingredients.Pineapple;
import ingredients.TomatoSauce;

public class PizzaMaker {

	public static void main(String[] args) {

		Pizza pizza1 = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + pizza1.getDescription());
		System.out.println("Price: " + pizza1.getCost() + "\n");
		
		
		
		Pizza pizza2 = new TomatoSauce(new Pineapple(new Ham(new PlainPizza())));
		
		System.out.println("Ingredients: " + pizza2.getDescription());
		System.out.println("Price: " + pizza2.getCost() + "\n");
		
		
		Pizza pizza3 = new TomatoSauce(new Mozzarella(new Ham(new PlainPizza())));
		
		System.out.println("Ingredients: " + pizza3.getDescription());
		System.out.println("Price: " + pizza3.getCost() + "\n");
	}

}
