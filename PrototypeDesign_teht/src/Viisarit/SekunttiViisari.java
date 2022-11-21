package Viisarit;

public class SekunttiViisari implements Cloneable {

	private int seconds;

	public SekunttiViisari(int sec) {
		this.seconds = sec;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
