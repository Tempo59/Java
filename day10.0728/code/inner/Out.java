package inner;

public class Out {
	
	String name = "123";
	
	public void fun() {
		class In{}
		System.out.println("�ⲿ���fun����");
	}
	
	//�ֲ��ڲ������ڵĳ�Ա����
	public void fun1() {
		System.out.println("�ⲿ���fun1����");
		//�ֲ��ڲ�����
		class In{
			String name = "asd";
			int a = 3;
			public void fun2() {
				System.out.println(name);
				System.out.println(Out.this.name);
				System.out.println("�ֲ��ڲ����fun2����");
			}
		}
		In i = new In();
		i.fun2();
	}

}







