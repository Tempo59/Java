package field;

import java.lang.reflect.Field;

public class Test {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Person p = new Person("张三", 12, '男', 100001);
		
		//获取Class对象
		Class cls = p.getClass();
		
		//通过cls对象获取属性
		Field f1 = cls.getField("name");
		System.out.println(f1);
//		Field[] fs = cls.getDeclaredFields();Field[] fs = cls.getDeclaredFields();
		//如何获取某个对象的f1表示的属性值
//		System.out.println(p.name);
		//使用Field类中的get方法
		System.out.println(f1.get(p));
		//修改p对象的f1属性
		f1.set(p, "李四");
		System.out.println(f1.get(p));
		System.out.println(p.name);
		
		//获取所有的共有属性
//		Field[] fs = cls.getFields();
//		System.out.println(fs.length);
		
		//循环出所有属性的值
		Field[] fs1 = cls.getDeclaredFields();
		for(Field f:fs1) {
			f.setAccessible(true);
			System.out.println(f+"---"+f.get(p));
			f.setAccessible(false);
		}
		
		
	}

}





