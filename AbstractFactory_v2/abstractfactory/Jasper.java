package abstractfactory;

import interfaces.Farmarit;
import interfaces.Kenka;
import interfaces.Lippis;
import interfaces.Tpaita;

public class Jasper {

	public Lippis lippis;
	public Tpaita tpaita;
	public Farmarit farmarit;
	public Kenka kenka;
	
	public Jasper(Factory f) {
		this.lippis = f.createLippis();
		this.tpaita = f.createTpaita();
		this.farmarit = f.createFarmarit();
		this.kenka = f.createKenka();
	}
	
	public void JasperinVaatteet() {
		System.out.println(String.format("Jasperilla on päällä:\n %s\n %s\n %s\n %s", lippis, tpaita, farmarit, kenka));

	}
}
