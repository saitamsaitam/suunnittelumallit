package mcdonalds;

public class BicMac {

	private String cheese = "";
	private String sauce = "";
	private String steak = "";
	
		
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}


	public void setSauce(String sauce) {
		this.sauce = sauce;
	}


	public void setSteak(String steak) {
		this.steak = steak;
	}





	@Override
	public String toString() {
		String s = "kastike: " + sauce + ", Juusto: " + cheese + ", Steak: " + steak;
		return s;
	}
}
