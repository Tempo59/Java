package field;

import java.lang.reflect.Field;

public class Test {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Person p = new Person("����", 12, '��', 100001);
		
		//��ȡClass����
		Class cls = p.getClass();
		
		//ͨ��cls�����ȡ����
		Field f1 = cls.getField("name");
		System.out.println(f1);
//		Field[] fs = cls.getDeclaredFields();Field[] fs = cls.getDeclaredFields();
		//��λ�ȡĳ�������f1��ʾ������ֵ
//		System.out.println(p.name);
		//ʹ��Field���е�get����
		System.out.println(f1.get(p));
		//�޸�p�����f1����
		f1.set(p, "����");
		System.out.println(f1.get(p));
		System.out.println(p.name);
		
		//��ȡ���еĹ�������
//		Field[] fs = cls.getFields();
//		System.out.println(fs.length);
		
		//ѭ�����������Ե�ֵ
		Field[] fs1 = cls.getDeclaredFields();
		for(Field f:fs1) {
			f.setAccessible(true);
			System.out.println(f+"---"+f.get(p));
			f.setAccessible(false);
		}
		
		
	}

}





