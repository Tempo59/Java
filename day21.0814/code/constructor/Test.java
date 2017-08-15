package constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//ͨ�����䴴��Animal����
		//��Ҫ�Ȼ�ȡClass����
		Class cls = Animal.class;
		
		//��ȡȫ�������췽��
		Constructor con1 = cls.getConstructor(String.class, int.class);
		
//		System.out.println(con1);
		
		Animal a = (Animal) con1.newInstance("Tom",12);
		
//		System.out.println(a);
		
		//��ȡ���еĹ������췽��
		Constructor[] cons = cls.getConstructors();
		System.out.println(cons.length);
		for(Constructor c:cons) {
			System.out.println(c);
		}
		
	}

}




