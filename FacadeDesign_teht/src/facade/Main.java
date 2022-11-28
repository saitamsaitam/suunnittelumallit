package facade;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ComputerFacade computer = new ComputerFacade(new CPU(), new Memory(), new HardDrive());
		
		computer.start();
	}

}
