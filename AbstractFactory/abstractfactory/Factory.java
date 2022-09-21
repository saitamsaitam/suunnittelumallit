package abstractfactory;

import interfaces.Farmarit;
import interfaces.Kenka;
import interfaces.Lippis;
import interfaces.Tpaita;

public abstract class Factory {

	public abstract Farmarit createFarmarit();
	
	public abstract Kenka createKenka();
	
	public abstract Lippis createLippis();
	
	public abstract Tpaita createTpaita();
}
