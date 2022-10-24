package cor;

public abstract class AmountOfRaise {
	
	protected static final double BASE = 2;
	private AmountOfRaise successor;

	public void setSuccessor(AmountOfRaise successor) {
		this.successor = successor;
	}

	public void processRequest(SalaryIncreaseRequest request) {
		if (successor != null)
			successor.processRequest(request);
	}
}
