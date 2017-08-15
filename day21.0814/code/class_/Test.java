package class_;

import qianfeng.class_.Person;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//��ȡPerson���Class����
		//ʹ��Object���е�getClass����
		Class cls = new Person().getClass();
		System.out.println(cls);
		
		//ʹ��class���Ի�ȡ
		Class cls1 = Person.class;
		System.out.println(cls1);
		
		System.out.println(cls.equals(cls1));
		
		//ʹ��Class���е�forName����
		Class cls2 = Class.forName("qianfeng.class_.Person");
		System.out.println(cls2);
		System.out.println(cls2.equals(cls));
		
		//ʹ�÷��䴴������
		Person p = (Person) cls.newInstance();
		System.out.println(p.name);
		System.out.println(p.age);
		
	}

}
