package test6;

public class TestKing {
	
	public static void main(String[] args) {
		
		King k = King.getKing();
		System.out.println(k);
		King k1 = King.getKing();
		System.out.println(k1);
		
		System.out.println(King.getKing());
		System.out.println(King.getKing());
		System.out.println(King.getKing());
		System.out.println(King.getKing());
		
	}

}
