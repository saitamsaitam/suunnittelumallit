package templatemethod;


public class HeitaNoppaa extends Game {

	
	private int noppa1;
	private int noppa2;
	private int summa;
	private boolean x = false;
	private int winner;

	
	
	public int heitaKahtaNoppaa() {
		noppa1 = (int)(Math.random() * 6) + 1;	
		noppa2 = (int)(Math.random() * 6) + 1;
		
		summa = noppa1 + noppa2;
		return summa;
	}
	
	
	
	@Override
	void initializeGame() {
		
	}

	@Override
	void makePlay(int player) {

		
		heitaKahtaNoppaa();
		System.out.println("player" + player + " heitti luvun " + summa);

		if(summa == 2) {
			x = true;
			winner = player;			
		}

	}

	@Override
	boolean endOfGame() {
		if (x) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {

		System.out.println("\nHurraa! voittaja on " + "pelaaja" + winner);
	}

}
