package cor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Director director = new Director();
		CEO ceo = new CEO();
		manager.setSuccessor(director);
		director.setSuccessor(ceo);

		
		try {
			while (true) {
				System.out.println("\n ** Enter the amount to check who should approve your salary increase. **");
				System.out.print(">");
				int i = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				manager.processRequest(new SalaryIncreaseRequest(i, "General"));
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}

}
