package myBook;

public class Boos {
	
	private String name;
	
	private Boos(String name) {
		this.name = name;
	}
	
	private static Boos b;
	
	public static Boos getB() {
		if(b==null) {
			b = new Boos("Tom");
		}
		return b;
	}
	
	

}
