package test;

public class Test {
	
	public static void main(String[] args) {
		
		final Boss b = new Boss("张三");
		System.out.println(b.getName());
		
		b.setName("李四");
		System.out.println(b.getName());
		
	}

}
