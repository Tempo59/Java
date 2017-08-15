package field;

import java.lang.reflect.Field;

public class Test2 {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Class cls = Person.class;
		
		Person p = (Person) cls.newInstance();
		
		//��ȡage����
		Field f1 = cls.getDeclaredField("age");
		System.out.println(f1);
		System.out.println(f1.get(p));
		f1.set(p, 12);
		System.out.println(f1.get(p));
		
		//��ȡsex����
		Field f2 = cls.getDeclaredField("sex");
		System.out.println(f2);
		f2.set(p, '��');
		System.out.println(f2.get(p));
		
		//��ȡid����
		Field f3 = cls.getDeclaredField("id");
//		f3.setAccessible(true);
//		System.out.println(f3.get(p));
//		f3.set(p, 12121212);
//		System.out.println(f3.get(p));
		
		//��ȡ���е�����
		Field[] fs = cls.getDeclaredFields();
		System.out.println(fs.length);
		for(Field f:fs) {
			System.out.println(f);
		}
		
	}

}





