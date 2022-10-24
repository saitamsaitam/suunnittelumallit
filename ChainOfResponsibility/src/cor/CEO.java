package cor;

public class CEO extends AmountOfRaise {
	
	private final double ALLOWABLE = 5;

	public void processRequest(SalaryIncreaseRequest request) {
		if (request.getAmount() >= ALLOWABLE) {
			System.out.println("CEO will approve a raise of " + request.getAmount() + "%");
		} 
	}
}
