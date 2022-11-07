package builder;

import hesburger.Burger;
import hesburger.Cheese;
import hesburger.SecretSauce;
import hesburger.Steak;
import mcdonalds.BicMac;

public class HesburgerBuilder implements IBurgerBuilder{

	private Burger burger;

	@Override
	public void createNewBurger() {
		burger = new Burger();
	}

	@Override
	public void buildCheese() {
		burger.setCheese(new Cheese());
	}

	@Override
	public void buildSauce() {
		burger.setSauce(new SecretSauce());
	}

	@Override
	public void buildSteak() {
		burger.setSteak(new Steak());
	}

	@Override
	public Burger getBurger() {
		return burger;
	}

	
	
}
