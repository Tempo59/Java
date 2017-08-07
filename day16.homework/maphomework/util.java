package maphomework;

import java.util.*;

public class util {
	
	final static HashMap<Person,String> map1=new HashMap<>();
	final static TreeMap<Student,Double> map2=new TreeMap<>();

	public static void hashMap(Person p) {
		map1.put(p, p.getName());
	}
	
	public static void treeMap(Student s) {
		map2.put(s,s.getAllgrade());
	}
}
