package method;

import java.lang.reflect.Method;

public class Test1 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Class cls = Person.class;
		
		//获取一个字符串参数的fun方法
		Method m1 = cls.getMethod("fun", String.class);
		System.out.println(m1);
		
		//获取一个字符串和一个整形参数的fun方法
		Method m2 = cls.getDeclaredMethod("fun", String.class, int.class);
		System.out.println(m2);
		
		Method[] ms1 = cls.getMethods();
		System.out.println(ms1.length);
		for(Method m:ms1) {
			System.out.println(m);
		}
		
		Method[] ms2 = cls.getDeclaredMethods();
		System.out.println(ms2.length);
		for(Method m:ms2) {
			System.out.println(m);
		}
		
	}

}


