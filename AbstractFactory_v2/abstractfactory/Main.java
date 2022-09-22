package abstractfactory;


public class Main {

	
	public static void main(String[] args) {
		
	
		//Factory f = new Adidas();
		Factory f = new Boss();
		
		Jasper jasper = new Jasper(f);
		jasper.JasperinVaatteet();

	}
}
