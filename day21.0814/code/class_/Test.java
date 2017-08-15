package class_;

import qianfeng.class_.Person;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//获取Person类的Class对象
		//使用Object类中的getClass方法
		Class cls = new Person().getClass();
		System.out.println(cls);
		
		//使用class属性获取
		Class cls1 = Person.class;
		System.out.println(cls1);
		
		System.out.println(cls.equals(cls1));
		
		//使用Class类中的forName方法
		Class cls2 = Class.forName("qianfeng.class_.Person");
		System.out.println(cls2);
		System.out.println(cls2.equals(cls));
		
		//使用反射创建对象
		Person p = (Person) cls.newInstance();
		System.out.println(p.name);
		System.out.println(p.age);
		
	}

}
