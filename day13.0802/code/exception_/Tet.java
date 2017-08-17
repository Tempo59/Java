package exception_;

public class Tet {
	
	public static void main(String[] args) {
		
//		String str =null;
//		str.length();
//		fun1(null);
		
		int a = 2;
		int b = 0;
		System.out.println(a/b);
		
	}
	
	public static void fun(String str) {
		System.out.println(str.length());
	}
	
	public static void fun1(String str) {
		fun(str);
	}

}
