package cor;

public class Manager extends AmountOfRaise {
	
	private final double ALLOWABLE = BASE;

	public void processRequest(SalaryIncreaseRequest request) {
		if (request.getAmount() <= ALLOWABLE) {
			System.out.println("Manager will approve a raise of " + request.getAmount() + "%");
		} else {
			super.processRequest(request);
		}
	}
}
