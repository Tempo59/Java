package string;

import java.util.Arrays;

public class Test4 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
//		String s2 = "hello";
//		System.out.println(s1.endsWith(s2));
//		System.out.println(s1.startsWith(s2));
		
		//getBytes()方法
		byte[] b = s1.getBytes();
//		System.out.println(b.length);
//		for(byte temp: b) {
//			System.out.print((char)temp);
//		}
		
		char[] ch = new char[10];
		//{ , , , , , , , , }
		
//		s1.getChars(0, 5, ch, 6);
//		for(char c:ch) {
//			System.out.print(c);
//		}
		
		//toCharArray()方法
		char[] c = s1.toCharArray();
		System.out.println(c.length);
		for(char temp:c) {
			System.out.println(temp);
		}
		
	}

}
