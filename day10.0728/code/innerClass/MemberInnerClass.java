package innerClass;

public class MemberInnerClass {
	
	String name = "123";
	
	public void fun() {
		System.out.println("�ⲿ���fun����");
	}
	
	//��Ա�ڲ���
	public class In{}
	
	//��Ա�ڲ���
	public class Inner{
		int age;
		String name = "asd";
		public void fun() {
			System.out.println(name);
			System.out.println(this.name);
//			System.out.println(super.name);
			System.out.println(MemberInnerClass.this.name);
			MemberInnerClass.this.fun();
			System.out.println("��Ա�ڲ����fun1����");
		}
	}

}







