package test1;

public class Animal {
	
	static int i = 10;
	
	String name;
	
	public static void main(String[] args) {
		
		int a = 4;
		
		System.out.println(Animal.i);
//		System.out.println(Animal.name);
		Animal a1 = new Animal();
		a1.i = 0;
		a1.name = "Tom";
		System.out.println(a1.i);
		System.out.println(a1.name);
		Animal a2 = new Animal();
		System.out.println(a2.i);
		System.out.println(a2.name);
		
	}

}
