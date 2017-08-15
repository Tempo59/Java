package constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//获取非私有的构造方法
		Class cls = Class.forName("constructor.Animal");
		
		//获取默认权限的构造方法(不可以使用getConstructor方法获取非共有的构造方法)
//		Constructor con = cls.getDeclaredConstructor(String.class);
		
		//直接使用con创建对象
//		Animal a = (Animal) con.newInstance("张三");
//		System.out.println(a);
		
		//获取受保护的构造方法
//		Constructor con1 = cls.getDeclaredConstructor(int.class);
//		con1.setAccessible(true);
//		Animal a1 = (Animal) con1.newInstance(12);
//		System.out.println(a1);
//		Animal a2 = new Animal(12);
		
		//获取所有的构造方法
		Constructor[] cons = cls.getDeclaredConstructors();
		System.out.println(cons.length);
		for(Constructor c:cons) {
			System.out.println(c);
		}
		
	}

}





