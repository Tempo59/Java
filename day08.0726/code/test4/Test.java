package test4;

public class Test {

	public static void main(String[] args) {
		
		new Object().toString();
		
		Dog d = new Dog("sdl", 2, 'n');
		Dog d1 = new Dog("sdl", 2, 'n');
		
		System.out.println(d.equals(d1));
		
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d1);
		
	}
	
}
