package facade;

public class CPU {

	
	public void Freeze() {
		
		System.out.println("freeze");
	}

	public void Jump(long position) {

		System.out.println("Jump: " + position);
	}

	void Execute() {

		System.out.println("Executing");
	}
	
	
}
