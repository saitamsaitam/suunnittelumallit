package memento;

public class Originator  {

	public int wantedNumber;

	public Memento joinGame() {

		Object letter = createLetter();

		return (Memento) letter;
	}

	public Object createLetter() {

		// Number between 0 - 10
		wantedNumber = (int) (Math.random() * 11);

		return new Memento(wantedNumber);
	}

	public int getLetterNumber() {

		return wantedNumber;
	}



	public synchronized boolean GuessTheNumber(Object letter, int guess) {

		if (((Memento) letter).getNumber() == guess) {

			return true;
		} else {
			return false;
		}
	}

	private class Memento {

		public int number;

		public Memento(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	}
}
