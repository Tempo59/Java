package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("hello", 1);
		map.put("world", 2);
		map.put("hello1", 3);
		map.put("helloworld", 4);
		//ʹ��keySet��ȡmap�������е�key
		Set<String> s = map.keySet();
		//��ȡ������
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str+"---"+map.get(str));
		}
		
	}

}






