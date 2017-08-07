package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
		
		HashMap<Person, String> map = new HashMap<>();
//		System.out.println(map.isEmpty());
		map.put(new Person("张三", 12), "hello");
//		System.out.println(map.isEmpty());
		map.put(new Person("张三", 12), "hello");
		map.put(new Person("lisi", 12), "hello");
		
		//删除张三
		System.out.println(map.remove(new Person("张三", 12)));
		System.out.println(map.size());
		
		
		//获取所有的value使用values方法
//		Collection<String> c = map.values();
//		System.out.println(c.size());
//		Iterator<String> it = c.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//获取所有的key使用keySet方法
//		Set<Person> s = map.keySet();
//		System.out.println(s.size());
//		Iterator<Person> it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println(map.size());
		
//		System.out.println(map.containsKey(new Person("张三", 12)));
		
//		System.out.println(map.containsValue("hello"));
		
//		HashMap<String, Person> map = new HashMap<>();
//		Person p = new Person("张三", 12);
//		map.put("张三", p);
//		map.put("李四", p);
//		System.out.println(map.get("李四"));
//		map.put("李四", new Person("李四", 12));
//		System.out.println(map.get("李四"));
//		System.out.println(map.size());
		
	}

}
