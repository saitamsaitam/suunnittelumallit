package director;

import builder.IBurgerBuilder;

public class Director {

	
	private IBurgerBuilder burgerBuilder;
	
	
	public void setBurgerBuilder(IBurgerBuilder builder) {
		burgerBuilder = builder;
	}
	
	public void createBurger() {
		burgerBuilder.createNewBurger();
		burgerBuilder.buildCheese();
		burgerBuilder.buildSauce();
		burgerBuilder.buildSteak();
	}
}
