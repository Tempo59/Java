package string;

public class Test6 {
	
	public static void main(String[] args) {
		
		String s = "hello hello hello";
		
		String s1 = s.replace('l', 'L');
//		System.out.println(s1);
		
		String s2 = s.replace("llo", "L-L-O");
//		System.out.println(s2);
		
		String s3 = s.substring(0);
		System.out.println(s3);
		
	}

}
