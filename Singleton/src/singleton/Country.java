package singleton;

public class Country {

	public String name;
	President p;
	
	public Country(String name, President p) {
		this.name = name;
		this.p = p;
	}


	@Override
	public String toString() {
		return "Country: " + name + ", President: " + p.getName();
	}
	
	
}
