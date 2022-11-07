package builder;

import mcdonalds.BicMac;

public class McdonaldsBuilder implements IBurgerBuilder{

	private BicMac burger;
	
	@Override
	public void createNewBurger() {
		burger = new BicMac();
	}

	@Override
	public void buildCheese() {
		burger.setCheese("Cheddar");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("Ketchup");
	}

	@Override
	public void buildSteak() {
		burger.setSteak("pihvi");
	}

	@Override
	public BicMac getBurger() {
		return burger;
	}

}
