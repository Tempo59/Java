package string;

public class Test8 {
	
	public static void main(String[] args) {
		
		boolean b = true;
		
		System.out.println(!true);
		
//		System.out.println(!(String.valueOf(true)));
//		System.out.println(!"true");
		
		String s = String.valueOf(b);
		System.out.println(s);
		
		int a = 5;
		System.out.println(1+a);
		System.out.println(1+(String.valueOf(a)));
		
	}

}
