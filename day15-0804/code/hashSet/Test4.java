package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test4 {
	
	public static void main(String[] args) {
		
		HashSet<Animal> set = new HashSet<>();
		Animal a1 = new Animal("��", 2, (char)2);
		Animal a2 = new Animal("��", 2, (char)2);
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		System.out.println(a1.equals(a2));
		set.add(a1);
		set.add(a2);
		set.add(new Animal("è", 1, 'f'));
		set.add(new Animal("��", 3, 'm'));
//		System.out.println(set.size());
//		String s1 = "123";
//		String s2 = "123";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		//��ǿforѭ������set����
		for(Animal a:set) {
			System.out.println(a);
		}
		
		//ʹ�õ���������set����
		Iterator<Animal> it = set.iterator();
		//ѭ�����ÿһ��Ԫ��
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}








