package string_;

public class Test2 {
	
	public static void main(String[] args) {
		
		String str1 = "-q";
		String regex1 = "\\w?";
//		System.out.println(str1.matches(regex1));
		
		String regex2 = "\\d{2,4}";
		String str2 = "12345";
		System.out.println(str2.matches(regex2));
		
	}

}
