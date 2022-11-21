package prototype;

import Viisarit.MinuuttiViisari;
import Viisarit.SekunttiViisari;
import Viisarit.TuntiViisari;

public class AnalogClock implements Clock, Cloneable{

	private TuntiViisari tViisari;
	private MinuuttiViisari mViisari;
	private SekunttiViisari sViisari;

	public AnalogClock() {
		this.tViisari = new TuntiViisari(12);
		this.mViisari = new MinuuttiViisari(0);
		this.sViisari = new SekunttiViisari(0);
		System.out.println("Analog Clock is made");
	}

	// Shallow copy
	public Clock makeCopy() {

		System.out.println("Analog Clock is Being Made	(shallow copy)");

		try {
			return (Clock) super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	// Deep copy
	public AnalogClock makeCopy2() {

		System.out.println("Analog Clock is Being Made	(deep copy)");

		AnalogClock ac = null;

		try {
			ac = (AnalogClock) super.clone();
			ac.tViisari = (TuntiViisari) tViisari.clone();
			ac.mViisari =  (MinuuttiViisari) mViisari.clone();
			ac.sViisari =  (SekunttiViisari) sViisari.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return ac;
	}

	
	
	
	public void changeTime(int hour, int minute, int seconds) {
		tViisari.setHour(hour);
		mViisari.setMinutes(minute);
		sViisari.setSeconds(seconds);
	}

	public String getTime() {
		String s = tViisari.getHour() + ":" + mViisari.getMinutes() + ":" + sViisari.getSeconds();
		return s;
	}

	
	
	
	public TuntiViisari getTViisari() {
		return tViisari;
	}

	public MinuuttiViisari getMViisari() {
		return mViisari;
	}

	public SekunttiViisari getSViisari() {
		return sViisari;
	}


	
	
	
	
	
	

}
