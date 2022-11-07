package builder;

public interface IBurgerBuilder {

	
	public abstract void createNewBurger();
	public abstract void buildCheese();
	public abstract void buildSauce();
	public abstract void buildSteak();
	
	
	public abstract Object getBurger();
}
