package singleton;

public class President {

	private static final President instance = new President("Lincoln");
	private String name;
	
	private President(String string) {
		this.name = string;
	}
	
	

	public static President getInstance() {
        return instance;
	}
	
	public String getName() {
		return name;
	}
}
