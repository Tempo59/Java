package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
		
		HashMap<Person, String> map = new HashMap<>();
//		System.out.println(map.isEmpty());
		map.put(new Person("����", 12), "hello");
//		System.out.println(map.isEmpty());
		map.put(new Person("����", 12), "hello");
		map.put(new Person("lisi", 12), "hello");
		
		//ɾ������
		System.out.println(map.remove(new Person("����", 12)));
		System.out.println(map.size());
		
		
		//��ȡ���е�valueʹ��values����
//		Collection<String> c = map.values();
//		System.out.println(c.size());
//		Iterator<String> it = c.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//��ȡ���е�keyʹ��keySet����
//		Set<Person> s = map.keySet();
//		System.out.println(s.size());
//		Iterator<Person> it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println(map.size());
		
//		System.out.println(map.containsKey(new Person("����", 12)));
		
//		System.out.println(map.containsValue("hello"));
		
//		HashMap<String, Person> map = new HashMap<>();
//		Person p = new Person("����", 12);
//		map.put("����", p);
//		map.put("����", p);
//		System.out.println(map.get("����"));
//		map.put("����", new Person("����", 12));
//		System.out.println(map.get("����"));
//		System.out.println(map.size());
		
	}

}
