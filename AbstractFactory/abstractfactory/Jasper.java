//package abstractfactory;
//
//import interfaces.Farmarit;
//import interfaces.Kenka;
//import interfaces.Lippis;
//import interfaces.Tpaita;
//
//public class Jasper {
//
//	Adidas adidas = new Adidas();
//	Boss boss = new Boss();
//	
//	public Lippis lippis;
//	public Tpaita tpaita;
//	public Farmarit farmarit;
//	public Kenka kengat;
//	
//	
//	public void pueAdidaksenVaatteet() {
//		this.lippis = adidas.createLippis();
//		this.tpaita = adidas.createTpaita();
//		this.farmarit = adidas.createFarmarit();
//		this.kengat = adidas.createKenka();
//	}
//	
//	public void pueBossinVaatteet() {
//		this.farmarit = boss.createFarmarit();
//		this.kengat = boss.createKenka();
//		this.lippis = boss.createLippis();
//		this.tpaita = boss.createTpaita();
//	}
//	
//	public String paallaOlevatVaatteet() {
//		return String.format("Päälläni on:\n %s\n %s\n %s\n %s\n", this.lippis, this.tpaita, this.farmarit, this.kengat);
//	}
//}
