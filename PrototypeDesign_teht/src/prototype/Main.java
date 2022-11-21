package prototype;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneFactory clockMaker = new CloneFactory();

		AnalogClock aClock = new AnalogClock();

		AnalogClock cloned1 = (AnalogClock) clockMaker.getClone(aClock);
		
		AnalogClock cloned2 = aClock.makeCopy2();
		
		AnalogClock cloned3 = (AnalogClock) clockMaker.getClone2(aClock);
		
		
		
		

		System.out.println("\naClock Time is " + aClock.getTime());

		System.out.println("\ncloned1 Time is " + cloned1.getTime());

		System.out.println("\ncloned2 Time is " + cloned2.getTime());
		
		System.out.println("\ncloned3 Time is " + cloned3.getTime());
		
		
		System.out.println("\n=================================\nChanging aClock time\n=================================");
		aClock.changeTime(18, 5, 5);

		
		System.out.println("\naClock Time is " + aClock.getTime());

		System.out.println("\ncloned Time is " + cloned1.getTime());

		System.out.println("\ncloned2 Time is " + cloned2.getTime());
		
		System.out.println("\ncloned3 Time is " + cloned3.getTime());
		
		System.out.println("\n=================================\nChanging cloned time\n=================================");
		cloned1.changeTime(19, 0, 0);

		
		System.out.println("\naClock Time is " + aClock.getTime());

		System.out.println("\ncloned Time is " + cloned1.getTime());

		System.out.println("\ncloned2 Time is " + cloned2.getTime());
		
		System.out.println("\ncloned3 Time is " + cloned3.getTime());
		
		
		System.out.println("\n=================================\nChanging cloned2 time\n=================================");
		cloned2.changeTime(21, 0, 0);

		
		System.out.println("\naClock Time is " + aClock.getTime());

		System.out.println("\ncloned Time is " + cloned1.getTime());

		System.out.println("\ncloned2 Time is " + cloned2.getTime());
		
		System.out.println("\ncloned3 Time is " + cloned3.getTime());
		
		
		System.out.println("\n=================================\nChanging cloned3 time\n=================================");
		cloned3.changeTime(23, 0, 0);

		
		System.out.println("\naClock Time is " + aClock.getTime());

		System.out.println("\ncloned Time is " + cloned1.getTime());

		System.out.println("\ncloned2 Time is " + cloned2.getTime());
		
		System.out.println("\ncloned3 Time is " + cloned3.getTime());
	}

}
