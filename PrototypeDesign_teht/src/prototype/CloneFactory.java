package prototype;


public class CloneFactory {

	// Factory has no idea what these objects are except that they are of a subclass of the Clock type

	
	
	// receive any Clock. Meaning any clock subclass and make a copy of it and then store it in its own location in memory

	
	// shallow copy
	public Clock getClone(Clock clock) {	
		
		return clock.makeCopy();
	}
	
	// deep copy
	public Clock getClone2(AnalogClock clock) {	
		
		return clock.makeCopy2();
	}
	
}
