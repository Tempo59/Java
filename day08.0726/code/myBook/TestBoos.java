package myBook;

public class TestBoos {
	
	public static void main(String[] args) {
		
		Boos b = Boos.getB();
		
		b = null;
		
		Boos b1 = Boos.getB();
		System.out.println(b);
		System.out.println(b1);
		
	}

}
