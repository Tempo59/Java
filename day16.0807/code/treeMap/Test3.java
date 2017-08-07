package treeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test3 {
	
	public static void main(String[] args) {
		
		TreeMap<Person, Integer> map = new TreeMap<>(new Person());
		map.put(new Person("a"), 1);
		map.put(new Person("c"), 2);
		map.put(new Person("f"), 3);
		
		Set<Person> s = map.keySet();
		Iterator<Person> it = s.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p+"---"+map.get(p));
		}
		
	}

}
