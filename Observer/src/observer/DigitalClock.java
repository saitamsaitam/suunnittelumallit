package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class DigitalClock  implements Observer{

	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		draw();
	}
	
	private void draw() {
		int hour = timer.getHour();
		int minute = timer.getMinute();
		int second = timer.getSecond();
		System.out.println("Digital		Hour: " + hour + ", minute: " + minute + ", second: " + second);
	}



	



}
