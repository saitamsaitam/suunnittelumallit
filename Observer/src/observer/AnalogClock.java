package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class AnalogClock implements Observer {

	
private ClockTimer timer;
	
	public AnalogClock(ClockTimer ct) {
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
		System.out.println("Analog   " + hour + ":" + minute + ":" + second);
	}
	
	
	

}
