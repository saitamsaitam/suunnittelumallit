package example1;

/* Testiluokka */
public class Main {
	
	
	public static void main(String[] args) {
	
		Valkokangas valkokangas = new Valkokangas();
		
		Command switchUp = new FlipUpCommand(valkokangas);
		Command switchDown = new FlipDownCommand(valkokangas);
		
		WallButton button1 = new WallButton(switchUp);
		WallButton button2 = new WallButton(switchDown);
		
		button1.push();
		button2.push();
	}
}
