package observer;

import java.util.Observable;


@SuppressWarnings("deprecation")
public class ClockTimer extends Observable implements Runnable {

	public int hour = 0;
	public int minute = 0;
	public int second = 0;
	
	public boolean lopeta = false;
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
		
	public void lopetus() {
		lopeta = true;
	}

	void tick() {
		notify();
	}

	@Override
	public void run() {
		
		while(!lopeta) {
			
			second++;
			if(second > 59) {
				minute++;
				second = 0;
			}
			
			if(minute > 59) {
				hour++;
				minute = 0;
				second = 0;
			}
			
			if(hour > 23) {
				hour = 0;
				minute = 0;
				second = 0;
			}
		
			setChanged();
			notifyObservers();

			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
		
}
