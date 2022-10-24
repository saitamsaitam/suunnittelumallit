package memento;

public class Caretaker extends Thread{

	public Originator host = new Originator();
	private Object letter;
	private String playerName;
	private int playerID;
	public static int numberOfPlayers = 0;
	
	private boolean gameOver = false;

	
	public Caretaker(String playerName) {
		numberOfPlayers++;
		this.playerName = playerName;
		this.playerID = numberOfPlayers;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerNumber) {
		this.playerID = playerNumber;
	}
	
	
	
	
	public void run() {
		
		letter = host.joinGame();
		
		System.out.println("player" + getPlayerID() + " is trying to guess the number: " + host.getLetterNumber());
		
		while(gameOver == false) {
			
			int random = (int)(Math.random() * 11);
			
			if(host.GuessTheNumber(letter, random)) {
				System.out.println("player" + getPlayerID() + " guessed: " + random + ", and it was CORRECT");
				gameOver = true;
			} else {
				System.out.println("player" + getPlayerID() + " guessed: " + random + ", TRY AGAIN");
			}
			try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
		}
		

		
	}
	
	
	
	
	
	
	
	
}
