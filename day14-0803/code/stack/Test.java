package stack;

import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		
//		System.out.println(s.size());
		
		s.push("����");
		System.out.println(s.search("����"));
//		System.out.println(s.empty());
		s.push("����");
		System.out.println(s.search("����"));
		s.push("����");
		
		System.out.println(s.search("����"));
		
//		System.out.println(s.peek());
////		System.out.println(s.size());
//		System.out.println(s.peek());
////		System.out.println(s.size());
//		
//		System.out.println(s.pop());
////		System.out.println(s.size());
//		System.out.println(s.pop());
//		System.out.println(s.empty());
		
	}

}
