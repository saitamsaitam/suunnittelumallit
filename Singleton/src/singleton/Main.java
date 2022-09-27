package singleton;

public class Main {

	
	// Tässä on yksinkertainen käyttötapaus. Maalla voi olla vain yksi presidentti. 
	// Joten aina kun presidenttiä tarvitaan, se yksi ja sama presidentti tulisi palauttaa sen sijaan, että luotaisiin uusi.
	
	public static void main(String[] args) {

		President x = President.getInstance();
		President y = President.getInstance();
		President z = President.getInstance();

		System.out.println("Presidentti: " + x.getName());
		System.out.println("Presidentti: " + y.getName());
		System.out.println("Presidentti: " + z.getName());

		// Printing the hash code 
		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());

		
		
		Country country = new Country("USA", x);

		System.out.println(country.toString());

	}

}
