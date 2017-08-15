package constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//通过反射创建Animal对象
		//需要先获取Class对象
		Class cls = Animal.class;
		
		//获取全参数构造方法
		Constructor con1 = cls.getConstructor(String.class, int.class);
		
//		System.out.println(con1);
		
		Animal a = (Animal) con1.newInstance("Tom",12);
		
//		System.out.println(a);
		
		//获取所有的公共构造方法
		Constructor[] cons = cls.getConstructors();
		System.out.println(cons.length);
		for(Constructor c:cons) {
			System.out.println(c);
		}
		
	}

}




