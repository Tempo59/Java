package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("Tom",12));
		set.add(new Person("Anna", 12));
		set.add(new Person(""));
		
		System.out.println(set.size());
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
