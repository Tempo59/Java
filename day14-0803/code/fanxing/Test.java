package fanxing;

public class Test {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
//		a1 = a2;
//		a2 = a1;
		Person<String, String> p1 = new Person<>();
		Person<String, String> p2 = new Person<>();
		p1 = p2;
		
	}

}
