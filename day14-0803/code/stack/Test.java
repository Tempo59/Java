package stack;

import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		
//		System.out.println(s.size());
		
		s.push("张三");
		System.out.println(s.search("张三"));
//		System.out.println(s.empty());
		s.push("李四");
		System.out.println(s.search("张三"));
		s.push("王五");
		
		System.out.println(s.search("张三"));
		
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
