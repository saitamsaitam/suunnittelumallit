package states;

import statedesign.Pokemon;
import statedesign.PokemonState;

public class Charizard implements PokemonState {

Pokemon pokemon;
	
	public Charizard(Pokemon newPokemon) {
		pokemon = newPokemon;
	}
	
	
	@Override
	public void pokemonType() {
		System.out.println("Type: Fire and Flying");
	}

	@Override
	public void useMove() {
		System.out.println("Use Flamethrower");

	}

	@Override
	public void pokemonWeakness() {
		System.out.println("Weakness: Water, Electric, Rock");
	}


	@Override
	public void evolve() {
		System.out.println("\nCharizard cannot evolve\n");
	}


	@Override
	public void getName() {
		System.out.println("Name: Charizard");
	}

}
