package memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Caretaker player1 = new Caretaker("Jukka");
		Caretaker player2 = new Caretaker("Pekka");
		Caretaker player3 = new Caretaker("Pekka");

		
		player1.start();
		player2.start();
		player3.start();

	}

}
