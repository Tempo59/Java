package test6;

public class Test {
	
	public static void main(String[] args) {
		
//		Animal a = new Animal();
		
//		Person p = new Person();
//		System.out.println(p);
		Boss b1 = Boss.getBoss();
		System.out.println(b1);
		Boss b2 = Boss.getBoss();
		System.out.println(b2);
		fun();
		
	}
	
	public static void fun() {
		Boss b = Boss.getBoss();
		System.out.println(b);
	}

}
