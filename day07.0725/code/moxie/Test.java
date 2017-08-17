package moxie;

public class Test {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2, 3);
		System.out.println(r.sum());
		System.out.println(r.area());
		
		Column c = new Column(5,2,3);
		System.out.println(c.sum());
		System.out.println(c.v());
		
	}
	
}
