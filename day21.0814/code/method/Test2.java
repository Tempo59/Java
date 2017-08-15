package method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class cls = Class.forName("method.Person");
		
		Person p = (Person) cls.newInstance();
		
		Method m1 = cls.getMethod("fun", int.class, int.class);
		
		System.out.println(m1.invoke(p, 12, 12));
		
	}

}
