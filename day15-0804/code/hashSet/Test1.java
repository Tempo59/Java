package hashSet;

import java.util.HashSet;

public class Test1 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		//���Ԫ��
		String str = new String("�����");
		set.add("�����");
		set.add("�����");
		set.add("���Ѿ�");
		set.add("���Ѿ�");
		set.add(str);
		System.out.println(str.equals("�����"));
		System.out.println(set.size());
		
	}

}
