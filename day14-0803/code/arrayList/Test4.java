package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Tom");
		l.add("����");
		l.add("����");
		
		fun(l, "����");
		
		//ʹ��ListIterator������������
		ListIterator<String> lit = l.listIterator();
		while(lit.hasNext()) {
//			System.out.println(lit.next());
			lit.next();
		}
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
//		//ʹ��l���ϻ�ȡ������
//		Iterator<String> it = l.iterator();
//		//�жϵ������Ƿ�����һ��Ԫ�أ�����ִ��ѭ���壬����ִ��
//		while(it.hasNext()) {
//			//����һ��Ԫ�����
//			System.out.println(it.next());
//		}
		
	}
	
	//���һ����������ĳһ��ArrayList������ɾ��ָ����Ԫ��
	public static void fun(ArrayList<String> l, String s) {
		Iterator<String> it = l.iterator();
		String strs = null;
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals(s)) {
				strs = str;
			}
		}
		l.remove(strs);
	}

}





