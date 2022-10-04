package states;

import statedesign.Pokemon;
import statedesign.PokemonState;

public class Charmander implements PokemonState {

	Pokemon pokemon;
	
	public Charmander(Pokemon newPokemon) {
		pokemon = newPokemon;
	}
	
	
	@Override
	public void pokemonType() {
		System.out.println("Type: Fire");
	}

	@Override
	public void useMove() {
		System.out.println("Use Ember");
		
	}

	@Override
	public void pokemonWeakness() {
		System.out.println("Weakness: Water, Ground, Rock");
	}


	@Override
	public void evolve() {
		System.out.println("\nCharmander evolves into Charmeleon\n");
		pokemon.setPokemonState(pokemon.getCharmeleon());
	}


	@Override
	public void getName() {
		System.out.println("Name: Charmander");
	}


}
