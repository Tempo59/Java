package hashMap;

import java.util.HashMap;

public class Test1 {
	
	public static void main(String[] args) {
		//����һ���յ�hashMap����
		HashMap<Integer, String> map = new HashMap<>();
		//���Ԫ��put����
		map.put(1, "�����");
		map.put(2, "���Ѿ�");
		System.out.println(map.size());
		//ʹ��get������ȡ1����Ӧ��value
		System.out.println(map.get(1));
	}

}
