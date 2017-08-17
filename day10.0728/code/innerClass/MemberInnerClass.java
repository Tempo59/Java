package innerClass;

public class MemberInnerClass {
	
	String name = "123";
	
	public void fun() {
		System.out.println("外部类的fun方法");
	}
	
	//成员内部类
	public class In{}
	
	//成员内部类
	public class Inner{
		int age;
		String name = "asd";
		public void fun() {
			System.out.println(name);
			System.out.println(this.name);
//			System.out.println(super.name);
			System.out.println(MemberInnerClass.this.name);
			MemberInnerClass.this.fun();
			System.out.println("成员内部类的fun1方法");
		}
	}

}







