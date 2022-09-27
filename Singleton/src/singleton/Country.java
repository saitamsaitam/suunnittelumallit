package singleton;

public class Country {

	public String name;
	President p = President.getInstance();
	
	public Country(String name, President p) {
		this.name = name;
		this.p = p;
	}


	@Override
	public String toString() {
		return "Country: " + name + ", President is " + p.getName();
	}
	
	
}
