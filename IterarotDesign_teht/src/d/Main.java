package d;



public class Main {

	public static void main(String[] args) {

		NumberList nl = new NumberList();
		
		Thread1 t1 = new Thread1(nl);
		Thread2 t2 = new Thread2(nl);
		
			
		
		t1.start();	
//		t2.start();	// Tulostaa 10 tähteä.
		
	}

}
