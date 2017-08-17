package test;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Person p1 = new Person();
		
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		
		System.out.println(p.toString());
		System.out.println(p1);
		
	}

}
