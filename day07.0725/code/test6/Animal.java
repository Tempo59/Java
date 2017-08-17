package test6;

public class Animal {
	
	private Animal() {}
	
	private static Animal a = new Animal();
	
	public static Animal getA() {
		return a;
	}

}
