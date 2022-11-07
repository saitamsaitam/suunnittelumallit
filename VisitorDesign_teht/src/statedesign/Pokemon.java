package statedesign;

import states.Charizard;
import states.Charmander;
import states.Charmeleon;
import visitor.PokemonVisitor;

public class Pokemon {

	PokemonState charmander;
	PokemonState charmeleon;
	PokemonState charizard;

	PokemonState pokemonState;

	public Pokemon() {
		charmander = new Charmander(this);
		charmeleon = new Charmeleon(this);
		charizard = new Charizard(this);

		pokemonState = charmander;
	}

	public void setPokemonState(PokemonState newPokemonState) {
		pokemonState = newPokemonState;
	}

	public void getName() {
		pokemonState.getName();
	}

	public void type() {
		pokemonState.pokemonType();
	}

	public void useMove() {
		pokemonState.useMove();
	}

	public void weakness() {
		pokemonState.pokemonWeakness();
	}

	public void accept(PokemonVisitor v) {
		pokemonState.accept(v);
	}

	public void evolve() {
		pokemonState.evolve();
	}

	public PokemonState getCharmander() {
		return charmander;
	}

	public PokemonState getCharmeleon() {
		return charmeleon;
	}

	public PokemonState getCharizard() {
		return charizard;
	}

}
