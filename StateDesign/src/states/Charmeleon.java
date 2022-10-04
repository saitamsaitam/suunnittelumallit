package states;

import statedesign.Pokemon;
import statedesign.PokemonState;

public class Charmeleon implements PokemonState {

Pokemon pokemon;
	
	public Charmeleon(Pokemon newPokemon) {
		pokemon = newPokemon;
	}
	
	
	@Override
	public void pokemonType() {
		System.out.println("Type: Fire");
	}

	@Override
	public void useMove() {
		System.out.println("Use Fire Fang");

	}

	@Override
	public void pokemonWeakness() {
		System.out.println("Weakness: Water, Ground, Rock");
	}


	@Override
	public void evolve() {
		System.out.println("\nCharmeleon evolves into Charizard\n");
		pokemon.setPokemonState(pokemon.getCharizard());
	}


	@Override
	public void getName() {
		System.out.println("Name: Charmeleon");
	}

}
