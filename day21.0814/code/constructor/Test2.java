package constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//��ȡ��˽�еĹ��췽��
		Class cls = Class.forName("constructor.Animal");
		
		//��ȡĬ��Ȩ�޵Ĺ��췽��(������ʹ��getConstructor������ȡ�ǹ��еĹ��췽��)
//		Constructor con = cls.getDeclaredConstructor(String.class);
		
		//ֱ��ʹ��con��������
//		Animal a = (Animal) con.newInstance("����");
//		System.out.println(a);
		
		//��ȡ�ܱ����Ĺ��췽��
//		Constructor con1 = cls.getDeclaredConstructor(int.class);
//		con1.setAccessible(true);
//		Animal a1 = (Animal) con1.newInstance(12);
//		System.out.println(a1);
//		Animal a2 = new Animal(12);
		
		//��ȡ���еĹ��췽��
		Constructor[] cons = cls.getDeclaredConstructors();
		System.out.println(cons.length);
		for(Constructor c:cons) {
			System.out.println(c);
		}
		
	}

}





