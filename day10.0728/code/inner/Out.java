package inner;

public class Out {
	
	String name = "123";
	
	public void fun() {
		class In{}
		System.out.println("外部类的fun方法");
	}
	
	//局部内部类所在的成员方法
	public void fun1() {
		System.out.println("外部类的fun1方法");
		//局部内部与类
		class In{
			String name = "asd";
			int a = 3;
			public void fun2() {
				System.out.println(name);
				System.out.println(Out.this.name);
				System.out.println("局部内部类的fun2方法");
			}
		}
		In i = new In();
		i.fun2();
	}

}







