package cor;

public class SalaryIncreaseRequest {
	
	private int amount;
	private String purpose;

	public SalaryIncreaseRequest(int amount, String purpose) {
		this.amount = amount;
		this.purpose = purpose;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amt) {
		amount = amt;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String reason) {
		purpose = reason;
	}
}
