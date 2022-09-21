package abstractfactory;

import interfaces.Farmarit;
import interfaces.Kenka;
import interfaces.Lippis;
import interfaces.Tpaita;

public class Main {

	
	public static void main(String[] args) {
		
	
		Factory f = new Adidas();
		//Factory f = new Boss();
		
		Lippis lippis = f.createLippis();
		Tpaita tpaita = f.createTpaita();
		Farmarit farmarit = f.createFarmarit();
		Kenka kenka = f.createKenka();
		
		System.out.println(String.format("Jasperilla on päällä:\n %s\n %s\n %s\n %s", lippis, tpaita, farmarit, kenka));
	}
}
