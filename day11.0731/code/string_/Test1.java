package string_;

public class Test1 {
	
	public static void main(String[] args) {
		
		String str1 = "f";
		String regex1 = "[a-dg-j]";
//		System.out.println(str1.matches(regex1));
		
		String str2 = "-";
		String regex2 = "[.]";
//		System.out.println(str2.matches(regex2));
		
		String str3 = "\\";
		String regex3 = "\\\\";// \\\
		System.out.println(regex3);
		System.out.println(str3.matches(regex3));
		
	}

}
