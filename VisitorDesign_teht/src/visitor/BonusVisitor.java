package visitor;

import states.Charizard;
import states.Charmander;
import states.Charmeleon;

public class BonusVisitor implements PokemonVisitor{

	
	@Override
	public void visitCharmander(Charmander charmander) {
		System.out.println("+10 points to Charmander");
	}

	@Override
	public void visitCharmeleon(Charmeleon charmeleon) {
		System.out.println("+15 points to Charmeleon");
	}

	@Override
	public void visitCharizard(Charizard charizard) {
		System.out.println("+20 points to Charizard");
	}

}
