package cor;

public class Director extends AmountOfRaise {
	
	private final double ALLOWABLE = BASE;

	public void processRequest(SalaryIncreaseRequest request) {
		if (request.getAmount() > ALLOWABLE && request.getAmount() < 5) {
			System.out.println("Director will approve a raise of " + request.getAmount() + "%");
		} else {
			super.processRequest(request);
		}
	}
}
