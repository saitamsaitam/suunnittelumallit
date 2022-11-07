package hesburger;

import java.util.ArrayList;

public class Burger {

	
	public Cheese cheese;
	public SecretSauce sauce;
	public Steak steak;
	
	ArrayList<Object> burger = new ArrayList<Object>();


	public Burger() {
		
	}
		
	public void addToBurger(Object o) {
		burger.add(o);
	}
	
	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
		burger.add(cheese);
	}

	public SecretSauce getSauce() {
		return sauce;
	}

	public void setSauce(SecretSauce sauce) {
		this.sauce = sauce;
		burger.add(sauce);
	}
	
	public void setSteak(Steak steak) {
		this.steak = steak;
		burger.add(steak);
	}
	
	@Override
	public String toString() {
		String s = "kastike: " + sauce + ", Juusto: " + cheese + ", Pihvi: " + steak;
		return s;
	}
	
	public void tulostaHamppari() {
		for(Object o : burger) {
			System.out.println(o.toString());
		}
	}
	
	
}
