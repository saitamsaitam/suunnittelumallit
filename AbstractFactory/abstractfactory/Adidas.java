package abstractfactory;

import interfaces.Farmarit;
import interfaces.Kenka;
import interfaces.Lippis;
import interfaces.Tpaita;
import vaatteet.AdidasFarmarit;
import vaatteet.AdidasKenka;
import vaatteet.AdidasLippis;
import vaatteet.AdidasTpaita;

public class Adidas extends Factory{
	@Override
	public Farmarit createFarmarit() {
		return new AdidasFarmarit();
	}

	@Override
	public Kenka createKenka() {
		return new AdidasKenka();
	}

	@Override
	public Lippis createLippis() {
		return new AdidasLippis();
	}

	@Override
	public Tpaita createTpaita() {
		return new AdidasTpaita();
	}
}
