package string;

public class Test {
	
	public static void main(String[] args) {
		
		String s1 = "123";
		String s2 = "123";
//		System.out.println(s1==s2);
		
		String str1 = new String("asd");
		String str2 = new String("asd");
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
		
		String s3 = "a";
		String s4 = "bc";
		String s5 = "abc";
		String s6 = "abc";
		System.out.println(s5==s6);
		System.out.println(s5);
		String s7 = s3 + s4;
		System.out.println(s7);
		System.out.println(s5==s7);
		System.out.println(s5.equals(s7));
		
	}

}





