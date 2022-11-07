package statedesign;

import visitor.BonusVisitor;
import visitor.PokemonVisitor;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Pokemon pokemon = new Pokemon();

		PokemonVisitor visitor = new BonusVisitor();

		int x = 0;

		while (x <= 2) {
			pokemon.getName();
			pokemon.type();
			pokemon.weakness();
			pokemon.useMove();
			pokemon.accept(visitor);

			Thread.sleep(2000);

			pokemon.evolve();

			Thread.sleep(4000);
			x++;
		}
	}

}
