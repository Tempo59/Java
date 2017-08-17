package staticInner;

public class Out {
	
	String name = "123";
	
	public static class In{
		int a = 2;
		String name = "asd";
		public void fun() {
			System.out.println(name);
			System.out.println(new Out().name);
			System.out.println("静态内部类的fun方法");
		}
	}

}
