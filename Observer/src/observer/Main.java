package observer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ClockTimer timer = new ClockTimer();

		DigitalClock dc = new DigitalClock(timer);
		//AnalogClock ac = new AnalogClock(timer);
		
		timer.addObserver(dc);
		//timer.addObserver(ac);
		

		new Thread(timer).start();

		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		timer.lopetus();
		
		
		


	}

}
