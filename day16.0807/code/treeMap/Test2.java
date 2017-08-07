package treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
	
	public static void main(String[] args) {
		
		TreeMap<Animal, Integer> map = new TreeMap<>();
		
//		map.put(1, new Animal("a"));
//		map.put(2, new Animal("a"));
//		map.put(3, new Animal("a"));
//		map.put(4, new Animal("a"));
		map.put(new Animal("a"), 1);
		map.put(new Animal("z"), 2);
		map.put(new Animal("c"), 3);
		
		System.out.println(map.size());
		
		Set<Map.Entry<Animal, Integer>> s = map.entrySet();
		Iterator<Map.Entry<Animal, Integer>> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
