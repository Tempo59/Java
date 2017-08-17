package test3;

public class Test1 {
	
	public static void main(String[] args) {
		
		Animal.fun1();
		new Animal().fun();
//		new Animal().fun1();
		
//		System.out.println(Animal.a);
//		Animal.a = 1;
//		Animal a = new Animal();
//		System.out.println(a.a);
//		Animal a1 = new Animal();
//		System.out.println(a1.a);
//		fun();
//		new Test1().fun1();
		
	}
	
	public static void fun() {
		System.out.println(Animal.a);
	}
	
	public void fun1() {
		System.out.println("fun1");
	}

}
