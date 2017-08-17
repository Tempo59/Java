package test3;

public class Animal {
	
	static{
		System.out.println("静态代码块执行");
	}
	{
		System.out.println("动态代码块执行");
	}
	
	public Animal() {
		System.out.println("创建了一个Animal对象");
	}
	
	static int a = 10;
	
	String name;
	
	public void fun() {
		System.out.println("fun");
	}
	
	public static void fun1() {
		System.out.println("fun1");
	}

}
