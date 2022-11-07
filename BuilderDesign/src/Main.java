import builder.HesburgerBuilder;
import builder.McdonaldsBuilder;
import director.Director;
import hesburger.Burger;
import mcdonalds.BicMac;

public class Main {

	public static void main(String[] args) {

		Director director = new Director();

		HesburgerBuilder hesburger = new HesburgerBuilder();

		director.setBurgerBuilder(hesburger);
		director.createBurger();

		
		Burger kerros = hesburger.getBurger();
		System.out.println(kerros);
		
		McdonaldsBuilder mc = new McdonaldsBuilder();

		director.setBurgerBuilder(mc);
		director.createBurger();

		
		BicMac bicmac = mc.getBurger();
		System.out.println(bicmac);
	}

}
