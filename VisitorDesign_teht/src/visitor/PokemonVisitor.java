package visitor;

import states.Charizard;
import states.Charmander;
import states.Charmeleon;

public interface PokemonVisitor {

	void visitCharmander(Charmander charmander);
	void visitCharmeleon(Charmeleon charmeleon);
	void visitCharizard(Charizard charizard);
}
