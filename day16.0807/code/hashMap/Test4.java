package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "h");
		map.put(2, "e");
		map.put(3, "l");
		map.put(4, "o");
		//使用entrySet方法遍历集合,获取键值对的Set集合
		Set<Map.Entry<Integer, String>> s = map.entrySet();
		//获取迭代器
		Iterator<Map.Entry<Integer, String>> it = s.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			System.out.println(me.getKey()+"---"+me.getValue());
		}
		
	}

}
