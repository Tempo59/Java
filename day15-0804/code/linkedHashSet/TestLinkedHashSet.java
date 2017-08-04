package linkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	
	//���һ����Ʒ�࣬����Ʒ���ƣ����ۣ����أ��ۼ�����
	//��дequals������hashCode��
	//��5����Ʒ������ӵ�һ��LinkedHashSet������
	//ʵ�����ع��ܣ�ʹ�õ���������
	
	public static void main(String[] args) {
		HashSet<Good> s = new HashSet<>();		
		LinkedHashSet<Good> set = new LinkedHashSet<>();
		Good g1 = new Good("������", 1, "̨��", 2);
		Good g2 = new Good("����", 2, "̨��", 5);
		Good g3 = new Good("����", 1, "̨��", 2);
		Good g4 = new Good("�齴��", 3, "̨��", 10);
		Good g5 = new Good("������", 1, "̨��", 2);
		//�򼯺�s�����Ԫ��
		s.add(g1);
		s.add(g2);
		s.add(g3);
		s.add(g4);
		s.add(g5);
		//�򼯺��������5����Ʒ����
		set.add(g1);
		set.add(g2);
		set.add(g3);
		set.add(g4);
		set.add(g5);
		System.out.println(set.size());
		//ʹ�õ���������set����
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		//����s����
		Iterator<Good> it1 = s.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
