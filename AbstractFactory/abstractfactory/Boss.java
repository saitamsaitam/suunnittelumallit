package abstractfactory;

import interfaces.Farmarit;
import interfaces.Kenka;
import interfaces.Lippis;
import interfaces.Tpaita;
import vaatteet.BossFarmarit;
import vaatteet.BossKenka;
import vaatteet.BossLippis;
import vaatteet.BossTpaita;

public class Boss extends Factory{

	@Override
	public Farmarit createFarmarit() {
		return new BossFarmarit();
	}

	@Override
	public Kenka createKenka() {
		return new BossKenka();
	}

	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}

	@Override
	public Tpaita createTpaita() {
		return new BossTpaita();
	}
}
