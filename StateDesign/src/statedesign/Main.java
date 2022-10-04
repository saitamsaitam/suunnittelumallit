package statedesign;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Pokemon pokemon = new Pokemon();
		
		int x = 0;
		
		while(x <= 2) {
			pokemon.getName();
			pokemon.type();
			pokemon.weakness();
			pokemon.useMove();

			Thread.sleep(2000);
			
			pokemon.evolve();

			Thread.sleep(4000);
			x++;
		}
	}

}
